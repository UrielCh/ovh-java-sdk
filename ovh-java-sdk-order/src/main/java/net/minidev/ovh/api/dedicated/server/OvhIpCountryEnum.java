package net.minidev.ovh.api.dedicated.server;

/**
 * Available localization for this static IP
 */
public enum OvhIpCountryEnum {
	au("au"),
	be("be"),
	ca("ca"),
	cz("cz"),
	de("de"),
	es("es"),
	fi("fi"),
	fr("fr"),
	ie("ie"),
	it("it"),
	lt("lt"),
	nl("nl"),
	pl("pl"),
	pt("pt"),
	sg("sg"),
	uk("uk"),
	us("us");

	final String value;

	OvhIpCountryEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
