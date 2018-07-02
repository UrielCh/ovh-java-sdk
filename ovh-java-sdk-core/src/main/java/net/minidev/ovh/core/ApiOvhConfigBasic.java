package net.minidev.ovh.core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiOvhConfigBasic extends ApiOvhConfig {
	public final static String configFiles = "./ovh.conf, ~/.ovh/config, ~/ovh.conf, /etc/ovh.conf".replace("/",
			File.separator);
	public final static String defaultApplicationKey = "So8hjoZsM5aYGWVO"; //"iE3vL3mgAtLZg00l";
	public final static String defaultApplicationSecret = "zEOWPt3TQ1JqKmQVP1JK6Ctp7iTdAyBe"; //"Gkmuh6Ce0SzxEAgexCA3zMkFGEWCwmqp";
	/**
	 * log
	 */
	private final static Logger log = LoggerFactory.getLogger(ApiOvhConfigBasic.class);
	/**
	 * 
	 */
	private File consumer_key_storage;
	/**
	 * Application redirectTo
	 */
	protected String redirection = "http://www.ovh.com/";
	/**
	 * the default Entry point is ovh EU
	 */
	protected String endpoint = OvhEntryPoint.OVH_EU;
	/**
	 * your application key or by default the key from api.ovh.com
	 */
	protected String applicationKey = defaultApplicationKey;
	/**
	 * ApplicationSecret or by default the key from api.ovh.com
	 */
	protected String applicationSecret = defaultApplicationSecret;
	/**
	 * CK for single account usage
	 */
	protected String default_CK = null;

	private static File configFile;

	ApiOvhConfigBasic() {
		File configFile = getOvhConfig();
		localConfigFile(configFile);
		localEnvironConfig();
	}

	public static File getOvhConfig() {
		if (configFile != null)
			return configFile;
		File userHomePath = new File(System.getProperty("user.home"));
		for (String path : configFiles.split(", ")) {
			path = path.replace("~", userHomePath.getAbsolutePath());
			File tmp = new File(path);
			if (tmp.exists()) {
				configFile = tmp;
				log.info("api-ovh-java Using configuration file:{}", path);
				return tmp;
			}
		}
		return null;
	}

	public void localEnvironConfig() {
		Map<String, String> env = System.getenv();
		if (env.containsKey("OVH_ENDPOINT"))
			endpoint = System.getenv("OVH_ENDPOINT");
		if (env.containsKey("OVH_APPLICATION_KEY"))
			applicationKey = System.getenv("OVH_APPLICATION_KEY");
		if (env.containsKey("OVH_APPLICATION_SECRET"))
			applicationSecret = System.getenv("OVH_APPLICATION_SECRET");
		if (env.containsKey("OVH_CONSUMER_KEY"))
			default_CK = System.getenv("OVH_CONSUMER_KEY");
		if (env.containsKey("OVH_REDIRECTION"))
			redirection = System.getenv("OVH_REDIRECTION");
		setConsumerKeyStorage(env.get("OVH_CONSUMER_KEY_STORAGE"));
	}

	public void localConfigFile(File configFile) {
		if (configFile == null)
			return;
		try {
			Properties config = new Properties();
			config.load(new FileInputStream(configFile));
			// get the values
			endpoint = config.getProperty("endpoint", endpoint);
			// https://eu.api.ovh.com/createApp/
			applicationKey = config.getProperty("application_key", applicationKey);
			applicationSecret = config.getProperty("application_secret", applicationSecret);
			default_CK = config.getProperty("consumer_key", default_CK);
			redirection = config.getProperty("redirection", redirection);
			setConsumerKeyStorage(config.getProperty("consumer_key_storage", null));
			if (applicationKey.endsWith(defaultApplicationKey))
				log.info("Using default ApplicationKey, you can create a new one here: {}", "https://eu.api.ovh.com/createApp/");
		} catch (Exception e) {
			// throw new OvhApiException(e.getMessage(), OvhApiExceptionCause.CONFIG_ERROR);
		}
	}

	private void setConsumerKeyStorage(String path) {
		if (path == null)
			return;
		File tmpF = new File(path);
		tmpF.mkdirs();
		if (tmpF.isDirectory())
			consumer_key_storage = tmpF;
		else
			log.error("invalid Consumer_key_storage {}", path);
	}

	static int e1 = 0;

	/**
	 * storage for previous CK
	 * 
	 * @return File used to store consumer key
	 */
	protected File gettmpStore(String nic) {
		if (consumer_key_storage == null || !consumer_key_storage.isDirectory()) {
			if (e1 == 0) {
				e1++;
				log.error(
						"No cert directory, can not save consumer_key! please set `consumer_key_storage` variable to a valid directory in your {}, or in your environ variale OVH_CONSUMER_KEY_STORAGE",
						configFiles);
			}
			return null;
		}
		return new File(consumer_key_storage, nic + ".ck.txt");

	}

	@Override
	protected String getConsumerKey() {
		return default_CK;
	}

	@Override
	protected String getConsumerKey(String nic) throws IOException {
		if (nic == null)
			return null;
		File lastKey = gettmpStore(nic);
		if (lastKey != null && lastKey.exists()) {
			BufferedReader in = null;
			try {
				in = new BufferedReader(new InputStreamReader(new FileInputStream(lastKey)));
				return in.readLine();
			} catch (Exception e) {
			} finally {
				if (in != null)
					in.close();
			}
		}
		return null;
	}

	@Override
	protected void setConsumerKey(String nic, String consumerKey) throws IOException {
		File lastKey = gettmpStore(nic);
		if (lastKey != null) {
			BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter(lastKey));
				bw.write(consumerKey);
			} catch (Exception e) {
			} finally {
				bw.close();
			}
		}
	}

	@Override
	protected boolean invalidateConsumerKey(String nic, String consumerKey) throws IOException {
		String oldCK = getConsumerKey(nic);
		if (oldCK == null)
			return false;
		if (!consumerKey.equals(oldCK))
			return false;
		log.info("invalidate CK {} for nic {}", consumerKey, nic);
		return gettmpStore(nic).delete();
	}

	@Override
	public String getEndpoint() {
		return endpoint;
	}

	static int e2 = 0;

	@Override
	public String getApplicationKey() {
		if (applicationKey.equals("iE3vL3mgAtLZg00l") && e2 == 0) {
			e2++;
			log.error(
					"no applicationKey, using the defaut one create a key, and set `application_key' and 'application_secret` variable in your {}, or in your environ variales OVH_APPLICATION_KEY and OVH_APPLICATION_SECRET",
					configFiles);
		}
		return applicationKey;
	}

	@Override
	public String getAppSecret() {
		return applicationSecret;
	}

}
