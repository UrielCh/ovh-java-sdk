package net.minidev.ovh.api.order.cart;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Representation of a product pricing
 */
public class OvhGenericProductPricing {
	/**
	 * Duration for ordering the product
	 *
	 * canBeNull && readOnly
	 */
	public String duration;

	/**
	 * Price of the product in micro-centims
	 *
	 * canBeNull && readOnly
	 */
	public Long priceInUcents;

	/**
	 * Pricing model identifier
	 *
	 * canBeNull && readOnly
	 */
	public String pricingMode;

	/**
	 * Price of the product
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice price;

	/**
	 * Minimum repeat for renewal
	 *
	 * canBeNull && readOnly
	 */
	public Long minimumRepeat;

	/**
	 * Description of the pricing
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Capacities of the pricing (type of pricing)
	 *
	 * canBeNull && readOnly
	 */
	public OvhGenericProductPricingCapacitiesEnum[] capacities;

	/**
	 * Interval of renewal
	 *
	 * canBeNull && readOnly
	 */
	public Long interval;

	/**
	 * Maximum repeat for renewal
	 *
	 * canBeNull && readOnly
	 */
	public Long maximumRepeat;

	/**
	 * Minimum quantity that can be ordered
	 *
	 * canBeNull && readOnly
	 */
	public Long minimumQuantity;

	/**
	 * Maximum quantity that can be ordered
	 *
	 * canBeNull && readOnly
	 */
	public Long maximumQuantity;

	/**
	 * Pricing type
	 *
	 * canBeNull && readOnly
	 */
	public OvhGenericProductPricingTypeEnum pricingType;
}
