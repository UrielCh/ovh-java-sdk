package net.minidev.ovh.core;

import java.io.IOException;

/**
 * @See {@link ApiOvhConfigBasic}
 * @See {@link ApiOvhConfigStatic}
 * 
 * @author uriel
 *
 */
public abstract class ApiOvhConfig {
	protected static ApiOvhConfig config = new ApiOvhConfigBasic();

	protected abstract String getEndpoint();

	protected abstract String getApplicationKey();

	protected abstract String getAppSecret();

	protected abstract String getConsumerKey();

	protected abstract String getConsumerKey(String nic) throws IOException;

	protected abstract void setConsumerKey(String nic, String CK) throws IOException;

	protected abstract boolean invalidateConsumerKey(String nic, String CK) throws IOException;
}
