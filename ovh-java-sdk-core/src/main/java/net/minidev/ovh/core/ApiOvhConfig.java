package net.minidev.ovh.core;

import java.io.IOException;

public abstract class ApiOvhConfig {
	protected static ApiOvhConfig config = new ApiOvhConfigBasic();

	protected abstract String getEndpoint();
	protected abstract String getApplicationKey();
	protected abstract String getRedirection();
	protected abstract String getAppSecret();
	protected abstract String getCK();
	protected abstract String getCK(String nic) throws IOException;

	protected abstract void setCK(String nic, String CK) throws IOException;

	protected abstract boolean invalidateCK(String nic, String CK) throws IOException;
}
