package net.minidev.ovh.api.dedicated.storage;

/**
 * Available types for NAS partition usage
 */
public enum OvhPartitionUsageTypeEnum {
	size("size"),
	used("used"),
	usedbysnapshots("usedbysnapshots");

	final String value;

	OvhPartitionUsageTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
