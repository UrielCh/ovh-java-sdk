package net.minidev.ovh.api.dedicated.server;

/**
 * distincts support level
 */
public enum OvhSupportLevelEnum {
	critical("critical"),
	fastpath("fastpath"),
	gs("gs"),
	pro("pro");

	final String value;

	OvhSupportLevelEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
