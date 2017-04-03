package net.minidev.ovh.api.dedicated.server;

/**
 * Available localization for this static IP
 */
public enum OvhIpStaticCountryEnum {
	be("be"),
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
	uk("uk");

	final String value;

	OvhIpStaticCountryEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
