package net.minidev.ovh.api.vps.ip;

/**
 * Ip types on a VPS
 */
public enum OvhTypeEnum {
	additional("additional"),
	primary("primary");

	final String value;

	OvhTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
