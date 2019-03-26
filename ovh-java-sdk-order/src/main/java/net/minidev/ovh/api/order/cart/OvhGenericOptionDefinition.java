package net.minidev.ovh.api.order.cart;

/**
 * Representation of a generic product option
 */
public class OvhGenericOptionDefinition {
	/**
	 * Define if options of this family are exclusive with each other
	 *
	 * canBeNull && readOnly
	 */
	public Boolean exclusive;

	/**
	 * Option family
	 *
	 * canBeNull && readOnly
	 */
	public String family;

	/**
	 * Prices of the product offer
	 *
	 * canBeNull && readOnly
	 */
	public OvhGenericProductPricing[] prices;

	/**
	 * Define if an option of this family is mandatory
	 *
	 * canBeNull && readOnly
	 */
	public Boolean mandatory;

	/**
	 * Name of the product
	 *
	 * canBeNull && readOnly
	 */
	public String productName;

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
}
