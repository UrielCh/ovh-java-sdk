package net.minidev.ovh.api.domain;

/**
 * Possible values for mailing list language
 */
public enum OvhDomainMlLanguageEnum {
	de("de"),
	en("en"),
	es("es"),
	fr("fr"),
	it("it"),
	nl("nl"),
	pl("pl"),
	pt("pt");

	final String value;

	OvhDomainMlLanguageEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
