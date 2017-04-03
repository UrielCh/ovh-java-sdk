package net.minidev.ovh.api.cloud.project;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Usage information for current month on your project
 */
public class OvhStorageUsage {
	/**
	 * Storage volume usage
	 *
	 * canBeNull
	 */
	public OvhStorageVolumeUsage[] volume;

	/**
	 * Cost for your storage in all your containers
	 *
	 * canBeNull
	 */
	public OvhPrice total;

	/**
	 * Storage bandwidth usage
	 *
	 * canBeNull
	 */
	public OvhBandwidthStorageUsage[] bandwidth;
}
