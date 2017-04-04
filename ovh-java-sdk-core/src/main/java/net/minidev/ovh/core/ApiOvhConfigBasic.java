package net.minidev.ovh.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// import net.minidev.sos.res.Res;

public class ApiOvhConfigBasic extends ApiOvhConfig {
	private final static String configFiles = "./ovh.conf, ~/.ovh/config, ~/ovh.conf or /etc/ovh.conf";
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
	//
	//
	// make dynamique
	protected String endpoint = "https://api.ovh.com/1.0";
	/**
	 * your application key or by default the key from api.ovh.com
	 */
	protected String applicationKey = "iE3vL3mgAtLZg00l";
	/**
	 * ApplicationSecret or by default the key from api.ovh.com
	 */
	protected String applicationSecret = "Gkmuh6Ce0SzxEAgexCA3zMkFGEWCwmqp";
	/**
	 * CK for single account usage
	 */
	protected String default_CK = null;

	ApiOvhConfigBasic() {
		File configFile = getOvhConfig();
		localConfigFile(configFile);
		localEnvironConfig();
	}

	public File getOvhConfig() {
		// local
		File configFile = new File("ovh.conf");
		if (configFile.exists())
			return configFile;
		File userHomePath = new File(System.getProperty("user.home"));
		configFile = new File(userHomePath, ".ovh");
		configFile = new File(configFile, "config");
		if (configFile.exists())
			return configFile;
		configFile = new File(userHomePath, "ovh.conf");
		if (configFile.exists())
			return configFile;
		configFile = new File("/etc/ovh.conf");
		if (configFile.exists())
			return configFile;
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
			applicationKey = config.getProperty("application_key", applicationKey);
			applicationSecret = config.getProperty("application_secret", applicationSecret);
			default_CK = config.getProperty("consumer_key", default_CK);
			redirection = config.getProperty("redirection", redirection);
			setConsumerKeyStorage(config.getProperty("consumer_key_storage", null));
		} catch (Exception e) {
			//throw new OvhApiException(e.getMessage(), OvhApiExceptionCause.CONFIG_ERROR);
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
	 * @return
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
	protected String getCK() {
		return default_CK;
	}

	@Override
	protected String getCK(String nic) throws IOException {
		File lastKey = gettmpStore(nic);
		if (lastKey != null && lastKey.exists()) {
			return FileUtils.readFileToString(lastKey, Charset.defaultCharset());
		}
		return null;
	}

	@Override
	protected void setCK(String nic, String CK) throws IOException {
		File lastKey = gettmpStore(nic);
		if (lastKey != null)
			FileUtils.write(lastKey, CK, Charset.defaultCharset());
	}

	@Override
	protected boolean invalidateCK(String nic, String CK) throws IOException {
		String old = getCK(nic);
		if (old == null)
			return false;
		if (!CK.equals(old))
			return false;
		log.info("invalidate CK {} for nic {}", CK, nic);
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
	public String getRedirection() {
		return redirection;
	}

	@Override
	public String getAppSecret() {
		return applicationSecret;
	}

}
