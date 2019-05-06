package net.minidev.ovh.api.cloud;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Details about flavor pricing
 */
public class OvhFlavorPrice {
	/**
	 * Flavor name
	 *
	 * canBeNull
	 */
	public String flavorName;

	/**
	 * Hourly flavor price
	 *
	 * canBeNull
	 */
	public OvhPrice price;

	/**
	 * Flavor id
	 *
	 * canBeNull
	 */
	public String flavorId;

	/**
	 * Flavor region
	 *
	 * canBeNull
	 */
	public String region;

	/**
	 * Monthly flavor price
	 *
	 * canBeNull
	 */
	public OvhPrice monthlyPrice;
}
