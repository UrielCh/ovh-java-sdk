package net.minidev.ovh.api.telephony;

/**
 * All existing types
 */
public enum OvhTypeServiceEnum {
	alias("alias"),
	line("line");

	final String value;

	OvhTypeServiceEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
