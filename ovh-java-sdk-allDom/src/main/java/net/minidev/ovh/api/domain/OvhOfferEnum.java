package net.minidev.ovh.api.domain;

/**
 * Offer
 */
public enum OvhOfferEnum {
	diamond("diamond"),
	gold("gold"),
	platinum("platinum");

	final String value;

	OvhOfferEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
