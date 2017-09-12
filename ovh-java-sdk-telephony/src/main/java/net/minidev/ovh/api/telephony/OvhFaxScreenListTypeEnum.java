package net.minidev.ovh.api.telephony;

/**
 * Type of screen list
 */
public enum OvhFaxScreenListTypeEnum {
	blacklist("blacklist"),
	no("no"),
	whitelist("whitelist");

	final String value;

	OvhFaxScreenListTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
