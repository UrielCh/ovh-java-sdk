package net.minidev.ovh.api.vps.ip;

/**
 * Geolocation of the IP Address
 */
public enum OvhGeolocationEnum {
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
	uk("uk"),
	us("us");

	final String value;

	OvhGeolocationEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
