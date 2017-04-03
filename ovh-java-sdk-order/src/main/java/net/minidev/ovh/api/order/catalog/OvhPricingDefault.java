package net.minidev.ovh.api.order.catalog;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describe default pricings
 */
public class OvhPricingDefault {
	/**
	 * Information about default pricing
	 *
	 * canBeNull && readOnly
	 */
	@JsonProperty("default")
	public OvhPricing[] _default;
}
