package net.minidev.ovh.api.reference;

/**
 * All country prices accessible from a reference
 */
public enum OvhCountryEnum {
	all("all"),
	ca("ca"),
	cz("cz"),
	de("de"),
	en("en"),
	es("es"),
	fi("fi"),
	fr("fr"),
	gb("gb"),
	ie("ie"),
	it("it"),
	lt("lt"),
	ma("ma"),
	nl("nl"),
	pl("pl"),
	pp("pp"),
	pt("pt"),
	qc("qc"),
	ru("ru"),
	sk("sk"),
	sn("sn"),
	tn("tn"),
	we("we");

	final String value;

	OvhCountryEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
