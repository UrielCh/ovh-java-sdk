package net.minidev.ovh.api.order.cart;

/**
 * Capacity of a pricing (type)
 */
public enum OvhGenericProductPricingCapacitiesEnum {
	installation("installation"),
	renew("renew"),
	upgrade("upgrade"),
	downgrade("downgrade");

	final String value;

	OvhGenericProductPricingCapacitiesEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
