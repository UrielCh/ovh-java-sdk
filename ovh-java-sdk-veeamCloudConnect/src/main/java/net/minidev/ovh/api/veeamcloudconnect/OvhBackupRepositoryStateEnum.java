package net.minidev.ovh.api.veeamcloudconnect;

/**
 * All states a Cloud Tenant backup repository can be in
 */
public enum OvhBackupRepositoryStateEnum {
	configuring("configuring"),
	delivered("delivered"),
	disabled("disabled"),
	disabling("disabling"),
	error("error"),
	migrating("migrating"),
	removing("removing");

	final String value;

	OvhBackupRepositoryStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
