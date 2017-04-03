package net.minidev.ovh.api.pack.xdsl;

/**
 * Allowed contexts when looking for shipping addresses
 */
public enum OvhShippingAddressContextEnum {
	migration("migration"),
	voipLine("voipLine");

	final String value;

	OvhShippingAddressContextEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
