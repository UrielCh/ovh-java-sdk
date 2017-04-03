package net.minidev.ovh.api.hosting.web;

/**
 * Available cluster countries
 */
public enum OvhCountryEnum {
	BE("BE"),
	CZ("CZ"),
	DE("DE"),
	ES("ES"),
	FI("FI"),
	FR("FR"),
	IE("IE"),
	IT("IT"),
	LT("LT"),
	NL("NL"),
	PL("PL"),
	PT("PT"),
	UK("UK");

	final String value;

	OvhCountryEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
