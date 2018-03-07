package net.minidev.ovh.api.overthebox;

/**
 * How do you want your shipment shipped
 */
public enum OvhShippingMethodEnum {
	dhl("dhl"),
	mondialRelay("mondialRelay");

	final String value;

	OvhShippingMethodEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
