package net.minidev.ovh.api.sms;

/**
 * Account status
 */
public enum OvhStatusAccountEnum {
	disable("disable"),
	enable("enable");

	final String value;

	OvhStatusAccountEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
