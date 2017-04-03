package net.minidev.ovh.api.dedicatedcloud;

/**
 * All countries in which an Ip Block may be ordered
 */
public enum OvhIpCountriesEnum {
	be("be"),
	ca("ca"),
	ch("ch"),
	cz("cz"),
	de("de"),
	es("es"),
	fi("fi"),
	fr("fr"),
	gb("gb"),
	ie("ie"),
	it("it"),
	lt("lt"),
	nl("nl"),
	pl("pl"),
	pt("pt"),
	us("us");

	final String value;

	OvhIpCountriesEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
