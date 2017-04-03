package net.minidev.ovh.api.price.dedicated.server;

/**
 * Enum of Ips
 */
public enum OvhIpEnum {
	kimsufi("kimsufi"),
	parking("parking");

	final String value;

	OvhIpEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
