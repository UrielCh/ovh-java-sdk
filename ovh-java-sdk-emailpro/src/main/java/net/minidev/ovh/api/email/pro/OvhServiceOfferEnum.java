package net.minidev.ovh.api.email.pro;

/**
 * Service Offer name
 */
public enum OvhServiceOfferEnum {
	emailpro("emailpro");

	final String value;

	OvhServiceOfferEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
