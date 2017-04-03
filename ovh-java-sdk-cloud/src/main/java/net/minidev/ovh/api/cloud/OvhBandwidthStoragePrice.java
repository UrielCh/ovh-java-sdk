package net.minidev.ovh.api.cloud;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Details about bandwidth storage pricing
 */
public class OvhBandwidthStoragePrice {
	/**
	 * Bandwidth storage price (for 1GB)
	 *
	 * canBeNull
	 */
	public OvhPrice price;

	/**
	 * Bandwidth storage region
	 *
	 * canBeNull
	 */
	public String region;
}
