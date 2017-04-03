package net.minidev.ovh.api.telephony.portability;

/**
 * Type of your service offer
 */
public enum OvhOfferType {
	company("company"),
	individual("individual");

	final String value;

	OvhOfferType(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
