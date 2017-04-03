package net.minidev.ovh.api.telephony;

/**
 * Offer task actions
 */
public enum OvhOfferTaskActionEnum {
	convertToAlias("convertToAlias"),
	convertToSip("convertToSip"),
	removeSimltaneousLines("removeSimltaneousLines"),
	termination("termination"),
	upgrade("upgrade");

	final String value;

	OvhOfferTaskActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
