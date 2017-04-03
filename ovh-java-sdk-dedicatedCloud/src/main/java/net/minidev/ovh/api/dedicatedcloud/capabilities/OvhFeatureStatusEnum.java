package net.minidev.ovh.api.dedicatedcloud.capabilities;

/**
 * All Dedicated Cloud feature status available
 */
public enum OvhFeatureStatusEnum {
	active("active"),
	comingSoon("comingSoon"),
	no("no");

	final String value;

	OvhFeatureStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
