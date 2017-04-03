package net.minidev.ovh.api.email.exchange;

/**
 * Service Offer name
 */
public enum OvhServiceOfferEnum {
	dedicated("dedicated"),
	hosted("hosted"),
	provider("provider");

	final String value;

	OvhServiceOfferEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
