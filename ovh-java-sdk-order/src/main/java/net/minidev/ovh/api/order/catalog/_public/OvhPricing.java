package net.minidev.ovh.api.order.catalog._public;

import net.minidev.ovh.api.order.cart.OvhDurationUnitEnum;
import net.minidev.ovh.api.order.cart.OvhGenericProductPricingCapacitiesEnum;
import net.minidev.ovh.api.order.cart.OvhGenericProductPricingStrategyEnum;
import net.minidev.ovh.api.order.cart.OvhGenericProductPricingTypeEnum;
import net.minidev.ovh.api.order.catalog._public.OvhPricingMinMax;

/**
 * Describes a Pricing for a Commercial offer
 */
public class OvhPricing {
	/**
	 * Phase for the Pricing
	 *
	 * canBeNull && readOnly
	 */
	public Long phase;

	/**
	 * Describes how many times the Commercial offer can be added to the Cart
	 *
	 * canBeNull && readOnly
	 */
	public OvhPricingMinMax quantity;

	/**
	 * Unit of the interval
	 *
	 * canBeNull && readOnly
	 */
	public OvhDurationUnitEnum intervalUnit;

	/**
	 * Engagement period
	 *
	 * canBeNull && readOnly
	 */
	public Long commitment;

	/**
	 * Pricing description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Tax that can be applied, in micro-cents
	 *
	 * canBeNull && readOnly
	 */
	public Long tax;

	/**
	 * Pricing type
	 *
	 * canBeNull && readOnly
	 */
	public OvhGenericProductPricingTypeEnum type;

	/**
	 * Pricing mode
	 *
	 * canBeNull && readOnly
	 */
	public String mode;

	/**
	 * Price, in micro-cents
	 *
	 * canBeNull && readOnly
	 */
	public Long price;

	/**
	 * Describes how many times the interval can be repeated
	 *
	 * canBeNull && readOnly
	 */
	public OvhPricingMinMax repeat;

	/**
	 * Pricing must be completed
	 *
	 * canBeNull && readOnly
	 */
	public Boolean mustBeCompleted;

	/**
	 * Length of the interval
	 *
	 * canBeNull && readOnly
	 */
	public Long interval;

	/**
	 * Capacities of the Pricing, describes what the Pricing can be used for
	 *
	 * canBeNull && readOnly
	 */
	public OvhGenericProductPricingCapacitiesEnum[] capacities;

	/**
	 * Pricing strategy
	 *
	 * canBeNull && readOnly
	 */
	public OvhGenericProductPricingStrategyEnum strategy;
}
