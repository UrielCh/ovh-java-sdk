package net.minidev.ovh.api.hosting.web.module;

/**
 * Install language
 */
public enum OvhLanguageEnum {
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

	OvhLanguageEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
