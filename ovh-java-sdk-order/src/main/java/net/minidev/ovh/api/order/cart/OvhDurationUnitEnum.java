package net.minidev.ovh.api.order.cart;

/**
 * Unit that correspond to a duration range
 */
public enum OvhDurationUnitEnum {
	month("month"),
	day("day"),
	none("none");

	final String value;

	OvhDurationUnitEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
