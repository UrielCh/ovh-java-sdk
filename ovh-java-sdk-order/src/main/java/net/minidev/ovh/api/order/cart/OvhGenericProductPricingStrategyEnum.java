package net.minidev.ovh.api.order.cart;

/**
 * Strategy of a Pricing
 */
public enum OvhGenericProductPricingStrategyEnum {
	stairstep("stairstep"),
	volume("volume"),
	tiered("tiered");

	final String value;

	OvhGenericProductPricingStrategyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
