package net.minidev.ovh.api.price.overthebox;

/**
 * Enum of Offers
 */
public enum OvhOfferEnum {
	basic("basic"),
	reseller("reseller");

	final String value;

	OvhOfferEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
