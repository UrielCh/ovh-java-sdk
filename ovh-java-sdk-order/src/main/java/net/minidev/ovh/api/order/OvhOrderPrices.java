package net.minidev.ovh.api.order;

/**
 * Prices of an order
 */
public class OvhOrderPrices {
	/**
	 * canBeNull
	 */
	public OvhPrice withTax;

	/**
	 * canBeNull
	 */
	public OvhPrice withoutTax;

	/**
	 * canBeNull
	 */
	public OvhPrice tax;
}
