package net.minidev.ovh.api.order.cart;

/**
 * Type of a product
 */
public enum OvhGenericProductTypeEnum {
	delivery("delivery"),
	deposit("deposit"),
	shipping("shipping");

	final String value;

	OvhGenericProductTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
