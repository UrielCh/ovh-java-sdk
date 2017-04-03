package net.minidev.ovh.api.telephony;

/**
 * Time conditions global status
 */
public enum OvhTimeConditionsGlobalStatusEnum {
	deleted("deleted"),
	disabled("disabled"),
	enabled("enabled");

	final String value;

	OvhTimeConditionsGlobalStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
