package net.minidev.ovh.api.dedicated.server;

/**
 * distincts support level
 */
public enum OvhSupportLevelOrderableEnum {
	critical("critical"),
	fastpath("fastpath"),
	gs("gs");

	final String value;

	OvhSupportLevelOrderableEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
