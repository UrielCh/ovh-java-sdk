package net.minidev.ovh.api.price.xdsl;

/**
 * Enum of Offerss
 */
public enum OvhOffersEnum {
	backup("backup");

	final String value;

	OvhOffersEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
