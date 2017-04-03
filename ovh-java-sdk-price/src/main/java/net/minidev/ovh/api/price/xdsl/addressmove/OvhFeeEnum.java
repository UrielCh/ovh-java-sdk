package net.minidev.ovh.api.price.xdsl.addressmove;

/**
 * Enum of Fees
 */
public enum OvhFeeEnum {
	keepPortability("keepPortability");

	final String value;

	OvhFeeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
