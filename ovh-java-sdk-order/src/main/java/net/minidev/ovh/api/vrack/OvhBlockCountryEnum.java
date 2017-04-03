package net.minidev.ovh.api.vrack;

/**
 * Possible localization for block
 */
public enum OvhBlockCountryEnum {
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

	OvhBlockCountryEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
