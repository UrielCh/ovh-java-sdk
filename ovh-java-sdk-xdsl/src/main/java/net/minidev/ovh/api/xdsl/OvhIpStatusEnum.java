package net.minidev.ovh.api.xdsl;

/**
 * Status of an IP.
 */
public enum OvhIpStatusEnum {
	active("active"),
	close("close"),
	toDelete("toDelete");

	final String value;

	OvhIpStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
