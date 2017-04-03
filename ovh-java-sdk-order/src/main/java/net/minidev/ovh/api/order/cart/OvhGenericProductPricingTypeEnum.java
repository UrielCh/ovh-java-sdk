package net.minidev.ovh.api.order.cart;

/**
 * Type of a pricing
 */
public enum OvhGenericProductPricingTypeEnum {
	rental("rental"),
	consumption("consumption"),
	purchase("purchase");

	final String value;

	OvhGenericProductPricingTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
