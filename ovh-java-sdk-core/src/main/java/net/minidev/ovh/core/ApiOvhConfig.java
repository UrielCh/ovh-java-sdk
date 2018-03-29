package net.minidev.ovh.core;

import java.io.IOException;

/**
 * {@link ApiOvhConfigBasic}
 * {@link ApiOvhConfigStatic}
 * 
 * @author uriel
 *
 */
public abstract class ApiOvhConfig {
	/**
	 * Default configuration
	 */
	protected static ApiOvhConfig config = new ApiOvhConfigBasic();

	protected abstract String getEndpoint();

	protected abstract String getApplicationKey();

	protected abstract String getAppSecret();

	protected abstract String getConsumerKey();

	protected abstract String getConsumerKey(String nic) throws IOException;

	protected abstract void setConsumerKey(String nic, String CK) throws IOException;

	protected abstract boolean invalidateConsumerKey(String nic, String CK) throws IOException;
	
    private int connectTimeout = 60000;
    private int readTimeout = 3 * 60000;
    
	protected int getReadTimeout() {
		return readTimeout;
	}

	protected int getConnectTimeout() {
		return connectTimeout;
	}

    public void setConnectTimeout(int timeout) {
        if (timeout < 0) {
            throw new IllegalArgumentException("timeout can not be negative");
        }
        connectTimeout = timeout;
    }

    public void setReadTimeout(int timeout) {
        if (timeout < 0) {
            throw new IllegalArgumentException("timeout can not be negative");
        }
        readTimeout = timeout;
    }
}
