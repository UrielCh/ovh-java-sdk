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
	 * Name of the product
	 *
	 * canBeNull && readOnly
	 */
	public String productName;

	/**
	 * Product type
	 *
	 * canBeNull && readOnly
	 */
	public OvhGenericProductTypeEnum productType;

	/**
	 * Product offer identifier
	 *
	 * canBeNull && readOnly
	 */
	public String planCode;
}
