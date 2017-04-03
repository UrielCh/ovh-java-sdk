package net.minidev.ovh.api.telephony;

/**
 * How the phone had been reset
 */
public enum OvhResetPhoneMethodEnum {
	code("code"),
	http("http");

	final String value;

	OvhResetPhoneMethodEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
