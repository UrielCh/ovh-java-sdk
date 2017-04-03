package net.minidev.ovh.api.coretypes;

/**
 * Ip versions
 */
public enum OvhIpVersionEnum {
	v4("v4"),
	v6("v6");

	final String value;

	OvhIpVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
