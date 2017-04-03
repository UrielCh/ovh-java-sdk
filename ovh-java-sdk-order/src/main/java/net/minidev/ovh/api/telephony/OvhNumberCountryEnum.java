package net.minidev.ovh.api.telephony;

/**
 * Number country
 */
public enum OvhNumberCountryEnum {
	be("be"),
	ch("ch"),
	de("de"),
	es("es"),
	fr("fr"),
	gb("gb"),
	uk("uk");

	final String value;

	OvhNumberCountryEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
