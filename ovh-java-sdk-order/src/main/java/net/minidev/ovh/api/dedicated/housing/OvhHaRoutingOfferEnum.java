package net.minidev.ovh.api.dedicated.housing;

/**
 * Housing bay High Availablility offers
 */
public enum OvhHaRoutingOfferEnum {
	ha2x2("ha2x2"),
	ha2x4("ha2x4");

	final String value;

	OvhHaRoutingOfferEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
