package net.minidev.ovh.api.connectivity.eligibility;

/**
 * Offer product provider
 */
public enum OvhOfferProductProviderEnum {
	AXIONE("AXIONE"),
	KOSC("KOSC"),
	ORANGE("ORANGE"),
	SFR("SFR");

	final String value;

	OvhOfferProductProviderEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
