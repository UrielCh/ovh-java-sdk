package net.minidev.ovh.api.telephony;

/**
 * Number offer
 */
public enum OvhNumberOffer {
	alias("alias"),
	didsOnly("didsOnly");

	final String value;

	OvhNumberOffer(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
