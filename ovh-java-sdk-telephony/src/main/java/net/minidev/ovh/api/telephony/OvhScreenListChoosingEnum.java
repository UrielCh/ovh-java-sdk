package net.minidev.ovh.api.telephony;

/**
 * Type of screen list
 */
public enum OvhScreenListChoosingEnum {
	blacklist("blacklist"),
	disabled("disabled"),
	whitelist("whitelist");

	final String value;

	OvhScreenListChoosingEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
