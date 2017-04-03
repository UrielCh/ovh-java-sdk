package net.minidev.ovh.api.price.pack.xdsl;

/**
 * Enum of Offerss
 */
public enum OvhOffersEnum {
	enterprise("enterprise"),
	express("express"),
	expressLite("expressLite");

	final String value;

	OvhOffersEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
