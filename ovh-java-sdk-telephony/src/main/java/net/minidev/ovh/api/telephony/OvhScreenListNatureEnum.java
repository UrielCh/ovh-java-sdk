package net.minidev.ovh.api.telephony;

/**
 * Nature of screen list
 */
public enum OvhScreenListNatureEnum {
	fax("fax"),
	international("international"),
	services("services"),
	special("special"),
	voicemail("voicemail");

	final String value;

	OvhScreenListNatureEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
