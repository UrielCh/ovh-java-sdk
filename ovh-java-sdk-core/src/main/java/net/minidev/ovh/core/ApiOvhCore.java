package net.minidev.ovh.core;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.entity.StringEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;

import net.minidev.html.HtmlForm;
import net.minidev.html.HtmlForms;
import net.minidev.net.Navigator;
//import net.minidev.ovh.api.ApiOvh;
import net.minidev.ovh.api.ApiOvhAuth;
import net.minidev.ovh.api.auth.OvhAccessRule;
import net.minidev.ovh.api.auth.OvhCredential;
import net.minidev.ovh.api.auth.OvhMethodEnum;

public class ApiOvhCore {
	/**
	 * log
	 */
	private ApiOvhConfig config;

	private final static Logger log = LoggerFactory.getLogger(ApiOvhCore.class);
	/**
	 * encoding
	 */
	private final static Charset UTF8 = Charset.forName("UTF-8");
	/**
	 * Store authenticated ApiOvhCore
	 */
	private final static HashMap<String, ApiOvhCore> cache = new HashMap<String, ApiOvhCore>();
	/**
	 * consumerKey
	 */
	private String consumerKey = null;

	// nic / passwor auth
	private String nic;
	private String password;
	//
	private int timeInSec;
	/**
	 * user to Synchronize timeStamp
	 */
	private Long timeOffset;

	public static void main(String[] args) throws Exception {
		ApiOvhCore api = new ApiOvhCore();
		api.requestToken();
	}

	/**
	 * create a new APIOVH
	 */
	public ApiOvhCore() {
		this(ApiOvhConfig.config);
	}

	/**
	 * create a new APIOVH
	 */
	public ApiOvhCore(ApiOvhConfig config) {
		this.config = config;
	}

	/**
	 * Connect to OVH using nic/password
	 * 
	 * @param nic
	 * @param password
	 */
	public ApiOvhCore(String nic, String password) {
		this();
		this.nic = nic;
		this.password = password;
	}

	public static ApiOvhCore getInstance(String ac, String password) {
		return getInstance(ac, password, 900);
	}

	/**
	 * Connect to the OVH API using a consumerKey contains in your ohv config file or environement variable
	 * @param ck the consumerKey
	 * @return an ApiOvhCore authenticate by consumerKey
	 */
	public static ApiOvhCore getInstance() {
		ApiOvhCore core = new ApiOvhCore();
		core.consumerKey = core.config.getCK();
		if (core.consumerKey == null) {
			log.error("no consumerKey present in your ovh.cong (consumer_key) or environement (OVH_CONSUMER_KEY)");
			return null;
		}
		return core;
	}

	/**
	 * Connect to the OVH API using a consumerKey
	 * @param consumerKey the consumerKey
	 * @return an ApiOvhCore authenticate by consumerKey
	 */
	public static ApiOvhCore getInstance(String consumerKey) {
		ApiOvhCore core = new ApiOvhCore();
		core.consumerKey = consumerKey;
		return core;
	}

	public static ApiOvhCore getInstance(String ac, String password, int timeInSec) {
		ApiOvhCore core = cache.get(ac);
		if (core != null)
			return core;
		synchronized (cache) {
			// double check instance availability
			core = cache.get(ac);
			if (core != null)
				return core;
			core = new ApiOvhCore();
			try {
				core.login(ac, password, timeInSec);
			} catch (Exception e) {
				log.error("login account {} failure", ac, e);
				return null;
			}
			cache.put(ac, core);
		}
		return core;
	}

	private Navigator getNavigator() {
		Navigator nav = new Navigator();
		nav.setHeader("X-Ovh-Application", config.getApplicationKey());
		nav.setHeader("Content-type", "application/json");
		nav.cnxRetry = 3;
		return nav;
	}

	public String getNic() {
		return nic;
	}

	public ApiOvhCore clone() {
		ApiOvhCore api = new ApiOvhCore();
		// api.AS = this.AS;
		api.consumerKey = this.consumerKey;
		return api;
	}

	/**
	 * sync local and remote time
	 */
	private void syncTime() {
		try {
			Long ovhTime = new ApiOvhAuth(this).time_GET();
			long myTime = System.currentTimeMillis() / 1000L;
			timeOffset = myTime - ovhTime;
		} catch (Exception e) {
			log.error("Failed syncronized Ovh Clock");
			timeOffset = 0L;
		}
	}

	private String getTimestamp() {
		if (timeOffset == null)
			syncTime();
		long now = System.currentTimeMillis() / 1000L;
		now += timeOffset;
		return Long.toString(now);
	}

	/**
	 * Create a new CK from a nic/password
	 */
	public boolean login(String nic, String password, int timeInSec) throws IOException {
		if (password == null) {
			// using CK only, no autologin			
			return false;
		}
		this.nic = nic;
		this.password = password;
		this.timeInSec = timeInSec;
		int retry = 10;

		String lastKey = config.getConsumerKey(nic);
		if (lastKey != null) {
			this.consumerKey = lastKey;
			return true;
		}
		// CK;
		while (!loginInternal(nic, password, timeInSec)) {
			retry--;
			if (retry <= 0) {
				log.error("LOGIN failure to {} after 10 retry", nic);
				return false;
			}
			ApiOvhUtils.sleep(2000);
		}
		return true;
	}

	/**
	 * Try to create a new CK from a nic/password
	 * 
	 * @param nic
	 * @param password
	 * @param timeInSec
	 * @return
	 * @throws IOException
	 */
	private boolean loginInternal(String nic, String password, int timeInSec) throws IOException {
		synchronized (nic.intern()) {
			String oldCK = config.getConsumerKey(nic);
			if (oldCK != null && consumerKey != null && !oldCK.equals(consumerKey)) {
				// a new CK is available try it first.
				consumerKey = oldCK;
				return true;
			}
			OvhCredential token = requestToken();
			log.info("validationUrl Url:{}", token.validationUrl);
			Navigator nav = new Navigator();
			String html = nav.getBody(token.validationUrl);
			if (html.contains("Too much requests"))
				return false;
			HtmlForms frms = new HtmlForms(html);
			HtmlForm frm = frms.getBigestForm();
			if (frm == null) {
				log.error("NO FRAME in: {}", html);
				return false;
			}
			int n = frm.size(); // frmName:null frmId:null Action:null (NbField:5)
			frm.getEntryByPosition(n - 3).value = nic;
			frm.getEntryByPosition(n - 2).value = password;
			frm.getEntryByPosition(n - 1).value = Integer.toString(timeInSec);
			String body = frm.call(nav, token.validationUrl);
			if (body.contains("Too much requests"))
				return false;
			if (body.contains("<p>The document has moved <a href=\"" + config.getRedirection() + "\">here</a>.</p>")) {
				consumerKey = token.consumerKey;
				config.setConsumerKey(nic, consumerKey);
				return true;
			}
			log.error("Error missing redirect in body:{}", body);
			// FileUtils.write(new File("/tmp/zarbie.html"), body);
			return false;
		}
	}

	/**
	 * Request for a new Token with full access
	 * @return
	 * @throws IOException
	 */
	public OvhCredential requestToken() throws IOException {
		OvhMethodEnum[] ms = OvhMethodEnum.values();
		OvhAccessRule[] rules = new OvhAccessRule[ms.length];
		for (int i = 0; i < ms.length; i++) {
			rules[i] = new OvhAccessRule();
			rules[i].method = ms[i];
			rules[i].path = "/*";
		}
		ApiOvhAuth auth = new ApiOvhAuth(this);
		return auth.credential_POST(rules, config.getRedirection());
	}

	/**
	 * Call REST entry point and handle errors
	 * @param method
	 * @param query
	 * @param payload
	 * @param needAuth
	 * @return
	 * @throws IOException
	 */
	public String exec(String method, String query, Object payload, boolean needAuth) throws IOException {
		if (payload == null)
			payload = "";
		String data = null;
		try {
			data = execInternal(method, query, payload, needAuth);
		} catch (OVHServiceException e0) {
			throw e0;
		} catch (ConnectTimeoutException e1) {
			log.error("CNX TIME OUT");
			data = execInternal(method, query, payload, needAuth);
		} catch (IOException e2) {
			log.error("API OVH ERROR", e2);
			throw e2;
		}
		return data;
	}

	private String execInternal(final String method, final String query, final Object payload, boolean needAuth) throws IOException {
		String txt = ApiOvhUtils.objectJsonBody(payload);
		String URL = config.getEndpoint() + query;
		int failure = 0;
		String response = "";
		// retry loop
		while (true) {
			String CK = this.consumerKey;
			Navigator nav = getNavigator();
			nav.setTimeOut(600000);
			nav.setCnxTimeOut(600000);
			nav.setMaxSize(4 * 1024 * 1024);
			if (needAuth) {
				String timestamp = getTimestamp();
				String toHash = config.getAppSecret() + "+" + CK + "+" + method + "+" + URL + "+" + txt + "+" + timestamp;
				String sig = "$1$" + ApiOvhUtils.digestSha1(toHash.getBytes(UTF8));
				nav.setHeader("X-Ovh-Timestamp", timestamp);
				nav.setHeader("X-Ovh-Signature", sig);
				nav.setHeader("X-Ovh-Consumer", CK);
			}
			if (method.equals("GET")) {
				HttpGet mtd = new HttpGet(URL);
				response = nav.getBody(mtd);
			} else if (method.equals("PUT")) {
				HttpPut mtd = new HttpPut(URL);
				mtd.setEntity(new StringEntity(txt, UTF8));
				response = nav.getBody(mtd);
			} else if (method.equals("POST")) {
				HttpPost mtd = new HttpPost(URL);
				mtd.setEntity(new StringEntity(txt, UTF8));
				response = nav.getBody(mtd);
			} else if (method.equals("DELETE")) {
				HttpDelete mtd = new HttpDelete(URL);
				response = nav.getBody(mtd);
			}
			// XML response
			if (response.startsWith("<") && response.contains("<title>500 Internal Server Error</title>")) {
				ApiOvhUtils.sleep(500);
				failure++;
				if (failure >= 5)
					throw new IOException(
							method + " " + query + " " + txt + " return: 500 Internal Server Error after " + failure + " retry TS: " + new Date());
				continue;
			}

			if (response.startsWith("{\"errorCode\":")) {//  errorCode=INVALID_CREDENTIAL, httpCode=403 Forbidden, message=This credential is not valid
				Map<String, Object> obj = ApiOvhUtils.mapper.readValue(response, t2);
				String errorCode = (String) obj.get("errorCode");

				boolean credentialError = "INVALID_CREDENTIAL".equals(errorCode) || "NOT_CREDENTIAL".equals(errorCode);

				if (credentialError && failure < 5) {
					if (nic == null) {
						log.error("{} and no nic/password provided, reconnection aboard", errorCode);
					} else {
						this.consumerKey.equals(CK);
						config.invalidateConsumerKey(nic, CK);
						failure++;
						login(this.nic, this.password, this.timeInSec);
						continue;
					}
				}
				// 
				if ("QUERY_TIME_OUT".equals(errorCode) && failure < 5) {
					failure++;
					continue;
				} // NOT_CREDENTIAL
				throw new IOException(query + " return: " + ApiOvhUtils.mapper.writeValueAsString(obj));
			}
			break;
		}

		if (response.startsWith("{\"message\":")) {
			LinkedHashMap<String, Object> obj = ApiOvhUtils.mapper.readValue(response, t1);
			Object message1 = obj.get("message");
			String message = (String) message1;
			if ("This service is expired".equals(message))
				throw new OVHServiceException(URL, message);
			if ("This service does not exist".equals(message))
				throw new OVHServiceException(URL, message);
			if (message.startsWith("The requested object"))
				// The requested object (id = 10884320) does not exist
				throw new OVHServiceException(URL, message);
			throw new IOException(method + " " + URL + " " + txt + " return: " + message);
		}
		return response;
	}

	private final static TypeReference<LinkedHashMap<String, Object>> t1 = new TypeReference<LinkedHashMap<String, Object>>() {
	};

	private final static TypeReference<Map<String, Object>> t2 = new TypeReference<Map<String, Object>>() {
	};
}
