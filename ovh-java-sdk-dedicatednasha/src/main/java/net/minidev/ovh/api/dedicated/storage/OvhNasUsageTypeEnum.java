package net.minidev.ovh.api.dedicated.storage;

/**
 * Available types for NAS usage
 */
public enum OvhNasUsageTypeEnum {
	size("size"),
	used("used"),
	usedbysnapshots("usedbysnapshots");

	final String value;

	OvhNasUsageTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
