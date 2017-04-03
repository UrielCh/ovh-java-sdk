package net.minidev.ovh.api.telephony;

/**
 * Offer task types
 */
public enum OvhOfferTaskTypeEnum {
	offer("offer"),
	option("option");

	final String value;

	OvhOfferTaskTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
