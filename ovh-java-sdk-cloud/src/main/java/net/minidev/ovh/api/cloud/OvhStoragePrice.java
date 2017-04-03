package net.minidev.ovh.api.cloud;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Details about storage pricing
 */
public class OvhStoragePrice {
	/**
	 * Hourly storage price (for 1GB stored per hour)
	 *
	 * canBeNull
	 */
	public OvhPrice price;

	/**
	 * Monthly storage price (for 1GB stored per month)
	 *
	 * canBeNull
	 */
	public OvhPrice monthlyPrice;

	/**
	 * Storage region
	 *
	 * canBeNull
	 */
	public String region;
}
