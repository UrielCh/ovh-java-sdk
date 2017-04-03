package net.minidev.ovh.api.dedicated.server;

/**
 * Monitoring alert language
 */
public enum OvhAlertLanguageEnum {
	cz("cz"),
	de("de"),
	en("en"),
	es("es"),
	fi("fi"),
	fr("fr"),
	it("it"),
	lt("lt"),
	nl("nl"),
	pl("pl"),
	pt("pt");

	final String value;

	OvhAlertLanguageEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
