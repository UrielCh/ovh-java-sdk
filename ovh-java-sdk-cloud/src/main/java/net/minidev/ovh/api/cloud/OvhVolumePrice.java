package net.minidev.ovh.api.cloud;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Details about volume pricing
 */
public class OvhVolumePrice {
	/**
	 * Hourly volume price (for 1GB per hour)
	 *
	 * canBeNull
	 */
	public OvhPrice price;

	/**
	 * Volume name
	 *
	 * canBeNull
	 */
	public String volumeName;

	/**
	 * Monthly volume price (for 1GB per month)
	 *
	 * canBeNull
	 */
	public OvhPrice monthlyPrice;

	/**
	 * Volume region
	 *
	 * canBeNull
	 */
	public String region;
}
