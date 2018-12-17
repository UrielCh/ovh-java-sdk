package net.minidev.ovh.api.order.catalog;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Describes a pricing
 */
public class OvhPricing {
	/**
	 * Minimum repeat duration
	 *
	 * canBeNull && readOnly
	 */
	public Long minimumRepeat;

	/**
	 * Unit interval for duration
	 *
	 * canBeNull && readOnly
	 */
	public String intervalUnit;

	/**
	 * Engagement period
	 *
	 * canBeNull && readOnly
	 */
	public Long commitment;

	/**
	 * Description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Maximum repeat duration
	 *
	 * canBeNull && readOnly
	 */
	public Long maximumRepeat;

	/**
	 * Price in microcents
	 *
	 * canBeNull && readOnly
	 */
	public Long priceInUcents;

	/**
	 * Max price customer will pay at the end of the period (cap)
	 *
	 * canBeNull && readOnly
	 */
	public Long priceCapInUcents;

	/**
	 * Price of the product
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice price;

	/**
	 * Whether the catalog must reach max repeat before subscription can use another one
	 *
	 * canBeNull && readOnly
	 */
	public Boolean mustBeCompleted;

	/**
	 * Strategy on which the pricing can change
	 *
	 * canBeNull && readOnly
	 */
	public String pricingStrategy;

	/**
	 * Install, renew ... What the pricing can be used for
	 *
	 * canBeNull && readOnly
	 */
	public String[] capacities;

	/**
	 * Number length of the interval
	 *
	 * canBeNull && readOnly
	 */
	public Long interval;

	/**
	 * Minimum quantity
	 *
	 * canBeNull && readOnly
	 */
	public Long minimumQuantity;

	/**
	 * Maximum quantity buyable
	 *
	 * canBeNull && readOnly
	 */
	public Long maximumQuantity;
}
