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
	 * Prices of the product offer
	 *
	 * canBeNull && readOnly
	 */
	public OvhGenericProductPricing[] prices;

	/**
	 * Option family
	 *
	 * canBeNull && readOnly
	 */
	public String family;

	/**
	 * Define if an option of this family is mandatory
	 *
	 * canBeNull && readOnly
	 */
	public Boolean mandatory;

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
