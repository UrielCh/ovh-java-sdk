package net.minidev.ovh.api.telephony;

/**
 * Return merchandise authorisation offer type
 */
public enum OvhRmaOfferTypeEnum {
	deposit("deposit"),
	loan("loan"),
	purchase("purchase");

	final String value;

	OvhRmaOfferTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
