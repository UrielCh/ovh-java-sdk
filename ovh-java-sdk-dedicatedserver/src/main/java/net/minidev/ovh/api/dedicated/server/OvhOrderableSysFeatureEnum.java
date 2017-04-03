package net.minidev.ovh.api.dedicated.server;

/**
 * Dedicated server orderable features
 */
public enum OvhOrderableSysFeatureEnum {
	backupProtocol("backupProtocol"),
	monitoring("monitoring");

	final String value;

	OvhOrderableSysFeatureEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
