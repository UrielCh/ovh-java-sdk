package net.minidev.ovh.api.telephony;

/**
 * All existing type of routing for a voicemail
 */
public enum OvhVoicefaxRoutingEnum {
	fax("fax"),
	voicemail("voicemail");

	final String value;

	OvhVoicefaxRoutingEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
