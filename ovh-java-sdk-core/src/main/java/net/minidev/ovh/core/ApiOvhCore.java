package net.minidev.ovh.core;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.TreeMap;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

//import net.minidev.ovh.api.ApiOvh;
import net.minidev.ovh.api.ApiOvhAuth;
import net.minidev.ovh.api.auth.OvhAccessRule;
import net.minidev.ovh.api.auth.OvhCredential;
import net.minidev.ovh.api.auth.OvhMethodEnum;

public class ApiOvhCore {
	/**
	 * Optional proxy used for connection
	 */
	private Proxy proxy;
	
	private String[] DEFAULT_ACCESS_RULES = new String[] { "DELETE /*", "GET /*", "POST /*", "PUT /*" };
	/**
	 * Optional Handlers
	 */
	private TreeMap<String, TreeMap<String, OphApiHandler>> mtdHandler;
	private String[] accessRules = DEFAULT_ACCESS_RULES;
	/**
	 * optional cache manager
	 */
	private CacheManager cacheManager;

	/**
	 * register and handlet linked to a method
	 * 
	 * @param method
	 *            GET PUT POST DELETE or ALL
	 * @param url
	 * @param handler
	 */
	public void registerHandler(String method, String url, OphApiHandler handler) {
		if (mtdHandler == null)
			mtdHandler = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

		TreeMap<String, OphApiHandler> reg;
		if (method == null)
			method = "ALL";
		reg = mtdHandler.get(method);
		if (reg == null) {
			reg = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
			mtdHandler.put(method, reg);
		}
		reg.put(url, handler);
	}

	public void setCacheManager(CacheManager cacheManager) {
		this.cacheManager = cacheManager;
	}

	public void setProxy(Proxy proxy) {
		this.proxy = proxy;
	}
	
	private ApiOvhConfig config;
	/**
	 * log
	 */
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
	private String _consumerKey = null;

	/**
	 * Discard a consumerKey from cache
	 * 
	 * @param nic
	 *            nichandler
	 * @param currentCK
	 * @throws IOException
	 */
	private void invalidateConsumerKey(String nic, String currentCK) throws IOException {
		config.invalidateConsumerKey(nic, currentCK);
	}

	private void setCK(String nic, String consumerKey) throws IOException {
		this._consumerKey = consumerKey;
		this.config.setConsumerKey(nic, consumerKey);
	}
	/*
	 * public String getConsumerKey() { if (_consumerKey == null) _consumerKey =
	 * config.getConsumerKey(); if (_consumerKey == null) throw new
	 * NullPointerException("ConsumerKey can not be null"); return _consumerKey; }
	 */

	public String getConsumerKeyOrNull() {
		if (_consumerKey == null)
			_consumerKey = config.getConsumerKey();
		return _consumerKey;
	}

	// nic / passwor auth
	private String nic;
	private String password;
	//
	private int timeInSec;
	/**
	 * user to Synchronize timeStamp
	 */
	private Long timeOffset;

	/**
	 * Overwrite Default accessRules (DELETE /*, GET /*, POST /*, PUT /*) If called
	 * with no parameter the Default Rules will be used.
	 * 
	 * @param accessRules
	 */
	public void setAccessRules(String... accessRules) {
		if (accessRules == null)
			this.accessRules = DEFAULT_ACCESS_RULES;
		else
			this.accessRules = accessRules;
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

	/**
	 * Connect to OVH using nic/password
	 * 
	 * @param nic
	 * @param password
	 */
	public ApiOvhCore(ApiOvhConfig config, String nic, String password) {
		this(config);
		this.nic = nic;
		this.password = password;
	}

	public static ApiOvhCore getInstance(String ac, String password) {
		return getInstance(ac, password, 900);
	}

	/**
	 * Connect to the OVH API using a consumerKey contains in your ovh config file
	 * or environment variable
	 * 
	 * @return an ApiOvhCore authenticate by consumerKey
	 */
	public static ApiOvhCore getInstance() {
		ApiOvhCore core = new ApiOvhCore();
		// core._consumerKey = core.config.getConsumerKey();
		core._consumerKey = core.getConsumerKeyOrNull();// config.getConsumerKey();
		if (core._consumerKey == null) {
			File file = ApiOvhConfigBasic.getOvhConfig();
			String location = ApiOvhConfigBasic.configFiles;
			if (file != null)
				location = file.getAbsolutePath();
			String url = "";
			String CK = "";
			try {
				OvhCredential credential = core.requestToken(null);
				url = credential.validationUrl;
				CK = credential.consumerKey;
			} catch (Exception e) {
				log.error("Fail to request a new Credential", e);
			}
			log.error("activate the CK {} here: {}", CK, url);
			throw new NullPointerException("no 'consumer_key' present in " + location
					+ " or environement 'OVH_CONSUMER_KEY', activate the CK '" + CK + "' here: " + url);
		}
		return core;
	}

	/**
	 * Connect to the OVH API using a consumerKey
	 * 
	 * @param consumerKey
	 *            the consumerKey
	 * @return an ApiOvhCore authenticate by consumerKey
	 */
	public static ApiOvhCore getInstance(String consumerKey) {
		ApiOvhCore core = new ApiOvhCore();
		core._consumerKey = consumerKey;
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

	/**
	 * Build an HTTP Request with customs headers (Content-Type, X-Ovh-Application)
	 * 
	 * @param method
	 * @param url
	 * @return
	 * @throws IOException
	 */
	private HttpURLConnection getRequest(String method, URL url) throws IOException {
		HttpURLConnection connection;
		if (proxy == null)
			connection = (HttpURLConnection) url.openConnection();
		else
			connection = (HttpURLConnection) url.openConnection(proxy);
		connection.setRequestMethod(method);
		connection.setReadTimeout(config.getReadTimeout());
		connection.setConnectTimeout(config.getConnectTimeout());
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setRequestProperty("X-Ovh-Application", config.getApplicationKey());
		return connection;
	}

	public String getNic() {
		return nic;
	}

	public ApiOvhCore clone() {
		ApiOvhCore api = new ApiOvhCore();
		api.config = this.config;
		api._consumerKey = this._consumerKey;
		api.nic = this.nic;
		api.password = this.password;
		api.timeInSec = this.timeInSec;
		api.timeOffset = this.timeOffset;
		api.mtdHandler = this.mtdHandler;
		api.proxy = this.proxy;
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

	/**
	 * issue an time syncronized timestamp.
	 * 
	 * @return
	 */
	private String getTimestamp() {
		if (timeOffset == null)
			syncTime();
		long now = System.currentTimeMillis() / 1000L;
		now -= timeOffset;
		return Long.toString(now);
	}

	/**
	 * Store password based credential for an automatic certificate generation
	 * 
	 * @param nic
	 * @param password
	 * @param timeInSec
	 */
	public void setLoginInfo(String nic, String password, int timeInSec) {
		nic = nic.toLowerCase();
		this.nic = nic;
		this.password = password;
		this.timeInSec = timeInSec;
	}

	/**
	 * Create a new CK from a nic/password and force login
	 */
	public boolean login(String nic, String password, int timeInSec) throws IOException {
		if (password == null) {
			// using CK only, no autologin
			return false;
		}
		setLoginInfo(nic, password, timeInSec);
		int retry = 0;

		String lastKey = config.getConsumerKey(nic);
		if (lastKey != null) {
			this.setCK(nic, lastKey);
			return true;
		}
		// no valid CK use login
		while (!loginInternal(nic, password, timeInSec)) {
			retry++;
			if (retry > 1) { //  no more retry
				log.error("LOGIN failure to {} after {} retry", nic, retry);
				return false;
			}
			long sleep = retry * 3000 + (long) (Math.random() * 5000);
			log.error("LOGIN failure to {} after will retry in {} ms", nic, sleep);
			ApiOvhUtils.sleep(sleep);
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
		// Due to per IP login rate limiting, we synchronize this part of the code.
		// if multiple IP available, it can be sync on public IP based token
		synchronized (ApiOvhCore.class) {
			String oldCK = config.getConsumerKey(nic);
			if (oldCK != null && _consumerKey != null && !oldCK.equals(_consumerKey)) {
				// a new CK is available try it first.
				_consumerKey = oldCK;
				return true;
			}
			OvhCredential token = requestToken(null);
			log.info("Generating a new ConsumerKey as appKey: {} for account {} valid for {} sec, validationUrl:{}",
					this.config.getApplicationKey(), nic, timeInSec, token.validationUrl);

			Document doc = Jsoup.connect(token.validationUrl).get();
			String html = doc.toString();
			if (html.contains("Too much requests"))
				return false;
			// <input type="hidden" name="sT" id="sT" value="XXXXX">
			Element st = doc.getElementById("sT");
			FormElement form = null;
			// get Parent Form
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
			// fill user and password field
			for (Element e : inputs) {
				String name = e.attr("name");
				String value = e.attr("value");
				String type = e.attr("type");
				if ("text".equals(type))
					value = nic;
				else if ("password".equals(type))
					value = password;
				validForm.data(name, value);
			}
			// set Expiration Date
			validForm.data("duration", Integer.toString(timeInSec));
			Document doc2 = validForm.post();
			Elements p = doc2.select("p");
			String pText = p.text();
			if ("The document has moved here.".equals(pText)) {
				log.info("a new consumerKey had been issued for {}", nic);
				this.setCK(nic, token.consumerKey);
				return true;
			}
			if ("Your token is now valid, you can use it in your application".equals(pText)) {
				log.info("a new consumerKey had been issued for {}", nic);
				this.setCK(nic, token.consumerKey);
				return true;
			}
			String error = doc2.select("div.error").text();
			if (error != null && error.length() > 0)
				log.error("Login {} Error:{}", nic, error);
			else {
				String body = doc2.toString();
				if (body.contains("Too much requests. Please retry in 3 seconds. ")) {
					log.error("Too much requests, block all connexion for 3sec, Retry later to connect {}", nic);
					ApiOvhUtils.sleep(3000);
				} else {
					log.error("Unknown Error connecting to {} in body:{}", nic, body);
				}
			}
			return false;
		}
	}

	/**
	 * Request for a new Token with full access
	 * 
	 * @param redirection
	 * @return a new OvhCredential
	 */
	public OvhCredential requestToken(String redirection) throws IOException {
		OvhAccessRule[] accessRules = new OvhAccessRule[this.accessRules.length];

		// {GET POST PUT DELETE} /*
		for (int i = 0; i < this.accessRules.length; i++) {
			String rule = this.accessRules[i];
			int p = rule.indexOf(" ");
			if (p == -1)
				throw new IOException("Invalid rule " + rule);
			String mtd = rule.substring(0, p);
			String path = rule.substring(p + 1);
			accessRules[i] = new OvhAccessRule();
			accessRules[i].method = OvhMethodEnum.valueOf(mtd.toUpperCase());
			accessRules[i].path = path;
		}
		ApiOvhAuth auth = new ApiOvhAuth(this);
		return auth.credential_POST(accessRules, redirection);
	}

	/**
	 * Call REST entry point and handle errors
	 * 
	 * @param method
	 * @param query
	 * @param payload
	 * @param needAuth
	 * @return Full response as String
	 * @throws IOException
	 */
	public String exec(String apiPath, String method, String query, Object payload, boolean needAuth)
			throws IOException {
		if (payload == null)
			payload = "";

		String responseText = null;

		boolean cached = false;
		if (cacheManager != null) {
			responseText = cacheManager.getCache(apiPath, method, query, payload);
			if (responseText != null)
				cached = true;
		}

		if (responseText == null)
			try {
				responseText = execInternal(method, query, payload, needAuth);
			} catch (OvhException e0) {
				throw e0;
			} catch (OvhServiceException e0) {
				throw e0;
			} catch (SocketTimeoutException e1) {
				log.error("calling {} {} Failed by timeout. (ConnectTimeout:{} ReadTimeout:{})", method, query,
						config.getConnectTimeout(), config.getReadTimeout());
				responseText = execInternal(method, query, payload, needAuth);
			} catch (IOException e2) {
				log.error("API OVH IOException", e2);
				throw e2;
			}
		if (cacheManager != null && !cached)
			cacheManager.setCache(apiPath, method, query, payload, responseText);

		if (mtdHandler != null) {
			for (String mtd : new String[] { method, "ALL" }) {
				TreeMap<String, OphApiHandler> handlers = null;
				OphApiHandler handler = null;
				handlers = mtdHandler.get(mtd);
				if (handlers == null)
					continue;
				handler = handlers.get(apiPath);
				if (handler == null)
					continue;
				try {
					handler.accept(method, method, payload, responseText);
				} catch (Exception e) {
					log.warn("Handler throw exeption on {} {} : {}", method, method, e);
				}
			}
		}
		return responseText;
	}

	private String execInternal(final String method, final String query, final Object payload, boolean needAuth)
			throws IOException {
		String txt = ApiOvhUtils.objectJsonBody(payload);
		URL url = new URL(config.getEndpoint().concat(query));
		int failure = 0;
		String response = "";
		// retry loop
		String currentCK = null;
		while (true) {
			HttpURLConnection connection = getRequest(method, url);
			if (needAuth) {
				currentCK = this.getConsumerKeyOrNull();
				if (currentCK == null)
					if (password != null) {
						synchronized (this.nic.intern()) {
							while (currentCK == null) {
								failure++;
								if (failure > 10)
									throw new NullPointerException(
											"Failed to allocate a new ConsumerKey for nic " + this.nic);
								login(this.nic, this.password, this.timeInSec);
								currentCK = this.getConsumerKeyOrNull();
							}
						}
					} else {
						OvhCredential credential = this.requestToken(null);
						log.error("No currentCK or user/password available, validate {} with {}", credential.consumerKey, credential.validationUrl);
						throw new IOException("active the CK " + credential.consumerKey + " here " + credential.validationUrl);
					}
				String timestamp = getTimestamp();
				String toHash = config.getAppSecret() + "+" + currentCK + "+" + method + "+" + url + "+" + txt + "+"
						+ timestamp;
				String sig = "$1$" + ApiOvhUtils.digestSha1(toHash.getBytes(UTF8));
				connection.setRequestProperty("X-Ovh-Timestamp", timestamp);
				connection.setRequestProperty("X-Ovh-Signature", sig);
				connection.setRequestProperty("X-Ovh-Consumer", currentCK);
			}
			if (txt != null && txt.length() > 0) {
				connection.setDoOutput(true);
				DataOutputStream out = new DataOutputStream(connection.getOutputStream());
				out.write(txt.getBytes(UTF8));
				out.flush();
				out.close();
			}

			String inputLine;
			int responseCode = connection.getResponseCode();
			InputStream stream = (responseCode == 200) ? connection.getInputStream() : connection.getErrorStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(stream));
			// build response
			StringBuilder responseSb = new StringBuilder();
			while ((inputLine = in.readLine()) != null) {
				responseSb.append(inputLine);
			}
			in.close();
			response = responseSb.toString();
			// XML response OVH internal Error.
			if (response.startsWith("<") && response.contains("<title>500 Internal Server Error</title>")) {
				ApiOvhUtils.sleep(500);
				failure++;
				if (failure >= 5)
					throw new IOException(method + " " + query + " " + txt + " return: 500 Internal Server Error after "
							+ failure + " retry TS: " + new Date());
				continue;
			}
			if (responseCode == 200)
				return response;
			OvhErrorMessage err = readAsError(response);
			if (err != null) {
				if (err.errorCode == null) {
					// application error response
					String message = err.message;
					if ("This service is expired".equals(message))
						throw new OvhServiceException(url.toString(), message);
					if ("This service does not exist".equals(message))
						throw new OvhServiceException(url.toString(), message);
					if (message.startsWith("The requested object"))
						// The requested object (id = 10884320) does not exist
						throw new OvhServiceException(url.toString(), message);
					throw new OvhServiceException(url.toString(), message);
					// throw new IOException(method + " " + url + " " + txt + " return: " +
					// message);
				}
				// all other errors
				if (failure < 3
						&& err.isErrorCode(OvhErrorMessage.INVALID_CREDENTIAL, OvhErrorMessage.NOT_CREDENTIAL)) {
					if (nic == null) {
						log.error("Get Error:{} and have no nic/password provided, reconnection feature non available.",
								err.errorCode);
					} else if (this._consumerKey.equals(currentCK)) {
						// check if the consumerKey had been renew from an other thread
						invalidateConsumerKey(nic, currentCK);
						failure++;
						login(this.nic, this.password, this.timeInSec);
						continue;
					} else {
						// the consumerKey had been modified by an other thread -> retry
						continue;
					}
				} else if (failure < 5 && err.isErrorCode(OvhErrorMessage.QUERY_TIME_OUT)) {
					ApiOvhUtils.sleep(100);
					failure++;
					continue;
				}
				String queryId = connection.getHeaderField("X-OVH-QUERYID");
				if (err.isErrorCode(OvhErrorMessage.NOT_GRANTED_CALL)) {
					throw new OvhException(method, query, err, queryId);
				}
				if (err.isErrorCode(OvhErrorMessage.INVALID_CREDENTIAL)) {
					log.error("INVALID_CREDENTIAL with AppKey:{} CK:{} failure:{}", config.getApplicationKey(),
							currentCK, failure);
					throw new OvhException(method, query, err, queryId);
				}
				throw new OvhException(method, query, err, queryId);
			}
			break;
		}
		return response;
	}

	private OvhErrorMessage readAsError(String response) throws JsonParseException, JsonMappingException, IOException {
		if (response == null)
			return null;
		if (!response.startsWith("{\"message\":") && !response.startsWith("{\"errorCode\":"))
			return null;
		OvhErrorMessage err = ApiOvhUtils.mapper.readValue(response, OvhErrorMessage.class);
		return err;
	}
}
