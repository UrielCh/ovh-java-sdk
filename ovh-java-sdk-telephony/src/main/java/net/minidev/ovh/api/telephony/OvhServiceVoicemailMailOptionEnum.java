package net.minidev.ovh.api.telephony;

/**
 * Voicemail configuration
 */
public enum OvhServiceVoicemailMailOptionEnum {
	attachment("attachment"),
	simple("simple");

	final String value;

	OvhServiceVoicemailMailOptionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
