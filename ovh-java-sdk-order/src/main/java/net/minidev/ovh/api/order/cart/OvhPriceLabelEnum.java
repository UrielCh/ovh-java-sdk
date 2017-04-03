package net.minidev.ovh.api.order.cart;

/**
 * Label corresponding to different type of price
 */
public enum OvhPriceLabelEnum {
	PRICE("PRICE"),
	DISCOUNT("DISCOUNT"),
	FEE("FEE"),
	TOTAL("TOTAL"),
	RENEW("RENEW");

	final String value;

	OvhPriceLabelEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
