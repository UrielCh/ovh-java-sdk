package net.minidev.ovh.api.hosting.web.localseo.location;

/**
 * Location country
 */
public enum OvhCountryEnum {
	FR("FR");

	final String value;

	OvhCountryEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
