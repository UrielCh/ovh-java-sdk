package net.minidev.ovh.api.price.email.exchange;

/**
 * Enum of Offers
 */
public enum OvhOfferEnum {
	hosted("hosted");

	final String value;

	OvhOfferEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
