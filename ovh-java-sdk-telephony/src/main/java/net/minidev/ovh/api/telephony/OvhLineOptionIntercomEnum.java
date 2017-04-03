package net.minidev.ovh.api.telephony;

/**
 * Intercom configuration
 */
public enum OvhLineOptionIntercomEnum {
	no("no"),
	prefixed("prefixed"),
	yes("yes");

	final String value;

	OvhLineOptionIntercomEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
