package net.minidev.ovh.api.connectivity.eligibility;

/**
 * Offer product type
 */
public enum OvhOfferProductTypeEnum {
	ADSL("ADSL"),
	FTTH("FTTH"),
	SDSL("SDSL"),
	VDSL("VDSL");

	final String value;

	OvhOfferProductTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
