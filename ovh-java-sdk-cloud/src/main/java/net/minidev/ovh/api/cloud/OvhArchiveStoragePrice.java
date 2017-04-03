package net.minidev.ovh.api.cloud;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Details about archive storage pricing
 */
public class OvhArchiveStoragePrice {
	/**
	 * Monthly archive storage price (for 1GB stored per month)
	 *
	 * canBeNull
	 */
	public OvhPrice monthlyPrice;

	/**
	 * Archive region
	 *
	 * canBeNull
	 */
	public String region;
}
