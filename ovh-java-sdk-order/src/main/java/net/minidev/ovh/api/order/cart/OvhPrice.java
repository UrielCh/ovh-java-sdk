package net.minidev.ovh.api.order.cart;

/**
 * Price informations with label
 */
public class OvhPrice {
	/**
	 * Price of the product
	 *
	 * canBeNull && readOnly
	 */
	public net.minidev.ovh.api.order.OvhPrice price;

	/**
	 * Label corresponding to a price
	 *
	 * canBeNull && readOnly
	 */
	public OvhPriceLabelEnum label;
}
