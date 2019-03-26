package net.minidev.ovh.api.order.catalog._public;

/**
 * Describes minimal and maximal values for a Pricing
 */
public class OvhPricingMinMax {
	/**
	 * Minimal value
	 *
	 * canBeNull && readOnly
	 */
	public Long min;

	/**
	 * Maximal value
	 *
	 * canBeNull && readOnly
	 */
	public Long max;
}
