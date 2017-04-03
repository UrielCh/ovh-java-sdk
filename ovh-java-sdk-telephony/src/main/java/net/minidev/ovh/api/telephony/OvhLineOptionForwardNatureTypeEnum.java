package net.minidev.ovh.api.telephony;

/**
 * The nature of the call forward
 */
public enum OvhLineOptionForwardNatureTypeEnum {
	fax("fax"),
	number("number"),
	voicemail("voicemail");

	final String value;

	OvhLineOptionForwardNatureTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
