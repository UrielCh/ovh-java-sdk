package net.minidev.ovh.api.order.cart;

/**
 * Representation of a generic product
 */
public class OvhGenericProductDefinition {
	/**
	 * Prices of the product offer
	 *
	 * canBeNull && readOnly
	 */
	public OvhGenericProductPricing[] prices;

	/**
	 * Product offer identifier
	 *
	 * canBeNull && readOnly
	 */
	public String planCode;

	/**
	 * Product type
	 *
	 * canBeNull && readOnly
	 */
	public OvhGenericProductTypeEnum productType;

	/**
	 * Name of the product
	 *
	 * canBeNull && readOnly
	 */
	public String productName;
}
