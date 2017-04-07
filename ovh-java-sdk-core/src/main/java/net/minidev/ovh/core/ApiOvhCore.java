package net.minidev.ovh.core;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;

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

	private HttpURLConnection getRequest(String method, URL url) throws IOException {
		HttpURLConnection request = (HttpURLConnection) url.openConnection();
		request.setRequestMethod(method);
		request.setReadTimeout(60000);
		request.setConnectTimeout(60000);
		request.setRequestProperty("Content-Type", "application/json");
		request.setRequestProperty("X-Ovh-Application", config.getApplicationKey());
		return request;
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
		nic = nic.toLowerCase();
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

			Document doc = Jsoup.connect(token.validationUrl).get();
			String html = doc.toString();
			if (html.contains("Too much requests"))
				return false;

			Element st = doc.getElementById("sT");
			FormElement form = null;

			for (Element elm : st.parents()) {
				// "form".equalsIgnoreCase(elm.tagName())
				if (elm instanceof FormElement) {
					form = (FormElement) elm;
					break;
				}
			}
			Elements inputs = form.select("input");
			Connection validForm = Jsoup.connect(token.validationUrl);
			validForm.followRedirects(false);
			for (Element e : inputs) {
				String value = e.attr("value");
				String type = e.attr("type");
				if ("text".equals(type))
					value = nic;
				else if ("password".equals(type))
					value = password;
				validForm.data(e.attr("name"), value);
			}
			validForm.data("duration", Integer.toString(timeInSec));
			Document doc2 = validForm.post();
			Elements p = doc2.select("p");
			if ("The document has moved here.".equals(p.text())) {
				consumerKey = token.consumerKey;
				config.setConsumerKey(nic, consumerKey);
				return true;
			}

			String error = doc2.select("div.error").text();
			if (error != null && error.length() > 0)
				log.error("Login Error:{}", error);
			else
				log.error("Error missing redirect in body:{}", doc2.toString());
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
		} catch (SocketTimeoutException e1) {
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
		URL url = new URL(config.getEndpoint() + query);
		int failure = 0;
		String response = "";
		// retry loop
		while (true) {
			String CK = this.consumerKey;
			HttpURLConnection request = getRequest(method, url);
			if (needAuth) {
				String timestamp = getTimestamp();
				String toHash = config.getAppSecret() + "+" + CK + "+" + method + "+" + url + "+" + txt + "+" + timestamp;
				String sig = "$1$" + ApiOvhUtils.digestSha1(toHash.getBytes(UTF8));
				request.setRequestProperty("X-Ovh-Timestamp", timestamp);
				request.setRequestProperty("X-Ovh-Signature", sig);
				request.setRequestProperty("X-Ovh-Consumer", CK);
			}
			if (txt != null && txt.length() > 0) {
				request.setDoOutput(true);
				DataOutputStream out = new DataOutputStream(request.getOutputStream());
				out.writeBytes(txt);
				out.flush();
				out.close();
			}

			String inputLine;
			int responseCode = request.getResponseCode();
			InputStream stream = (responseCode == 200) ? request.getInputStream() : request.getErrorStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(stream));
			// build response
			StringBuilder responseSb = new StringBuilder();
			while ((inputLine = in.readLine()) != null) {
				responseSb.append(inputLine);
			}
			in.close();
			response = responseSb.toString();
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
				throw new OVHServiceException(url.toString(), message);
			if ("This service does not exist".equals(message))
				throw new OVHServiceException(url.toString(), message);
			if (message.startsWith("The requested object"))
				// The requested object (id = 10884320) does not exist
				throw new OVHServiceException(url.toString(), message);
			throw new IOException(method + " " + url + " " + txt + " return: " + message);
		}
		return response;
	}

	private final static TypeReference<LinkedHashMap<String, Object>> t1 = new TypeReference<LinkedHashMap<String, Object>>() {
	};

	private final static TypeReference<Map<String, Object>> t2 = new TypeReference<Map<String, Object>>() {
	};
}
