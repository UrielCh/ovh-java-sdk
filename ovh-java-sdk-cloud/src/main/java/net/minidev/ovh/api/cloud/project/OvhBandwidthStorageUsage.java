package net.minidev.ovh.api.cloud.project;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Usage information for current month on your project
 */
public class OvhBandwidthStorageUsage {
	/**
	 * Cost for your storage bandwidth
	 *
	 * canBeNull
	 */
	public OvhPrice total;

	/**
	 * Downloaded bytes from your containers
	 *
	 * canBeNull
	 */
	public Long downloadedBytes;

	/**
	 * Region
	 *
	 * canBeNull
	 */
	public String region;
}
