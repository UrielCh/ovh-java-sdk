package net.minidev.ovh.api.hosting.web.localseo.location;

/**
 * Location offer
 */
public enum OvhOfferEnum {
	normal("normal");

	final String value;

	OvhOfferEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
