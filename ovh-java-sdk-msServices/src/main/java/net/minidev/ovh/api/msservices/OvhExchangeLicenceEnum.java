package net.minidev.ovh.api.msservices;

/**
 * Exchange account licence
 */
public enum OvhExchangeLicenceEnum {
	basic("basic"),
	enterprise("enterprise"),
	standard("standard");

	final String value;

	OvhExchangeLicenceEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
