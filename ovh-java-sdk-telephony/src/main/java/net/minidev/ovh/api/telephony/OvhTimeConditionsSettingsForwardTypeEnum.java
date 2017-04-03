package net.minidev.ovh.api.telephony;

/**
 * Forward type
 */
public enum OvhTimeConditionsSettingsForwardTypeEnum {
	number("number"),
	voicemail("voicemail");

	final String value;

	OvhTimeConditionsSettingsForwardTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
