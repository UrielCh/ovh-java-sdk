package net.minidev.ovh.api.cloud;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Details about snapshot pricing
 */
public class OvhSnapshotPrice {
	/**
	 * Hourly snapshot price (for 1GB per hour)
	 *
	 * canBeNull
	 */
	public OvhPrice price;

	/**
	 * Monthly flavor price (for 1GB per month)
	 *
	 * canBeNull
	 */
	public OvhPrice monthlyPrice;

	/**
	 * Snapshot region
	 *
	 * canBeNull
	 */
	public String region;
}
