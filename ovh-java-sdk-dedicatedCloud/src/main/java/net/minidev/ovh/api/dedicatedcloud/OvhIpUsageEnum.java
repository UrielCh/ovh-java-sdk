package net.minidev.ovh.api.dedicatedcloud;

/**
 * IP address usage
 */
public enum OvhIpUsageEnum {
	reserved("reserved"),
	vm("vm");

	final String value;

	OvhIpUsageEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
