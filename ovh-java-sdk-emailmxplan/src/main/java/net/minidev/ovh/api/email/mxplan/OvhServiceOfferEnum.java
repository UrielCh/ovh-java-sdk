package net.minidev.ovh.api.email.mxplan;

/**
 * Service Offer name
 */
public enum OvhServiceOfferEnum {
	MXPLAN("MXPLAN");

	final String value;

	OvhServiceOfferEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
