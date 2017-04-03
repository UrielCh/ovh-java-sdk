package net.minidev.ovh.api.telephony;

/**
 * Available language for your conference
 */
public enum OvhConferenceLanguageEnum {
	de("de"),
	en("en"),
	es("es"),
	fr("fr"),
	it("it");

	final String value;

	OvhConferenceLanguageEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
