package net.minidev.ovh.api.telephony;

/**
 * Offer task types
 */
public enum OvhOfferTaskTypeEnum {
	line("line"),
	offer("offer"),
	option("option"),
	phone("phone");

	final String value;

	OvhOfferTaskTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
