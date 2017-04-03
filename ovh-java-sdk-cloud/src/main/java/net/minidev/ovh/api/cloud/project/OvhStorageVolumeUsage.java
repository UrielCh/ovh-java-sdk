package net.minidev.ovh.api.cloud.project;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Storage volume used on your project
 */
public class OvhStorageVolumeUsage {
	/**
	 * Bytes stored in your containers
	 *
	 * canBeNull
	 */
	public Long storedBytes;

	/**
	 * Cost for your storage bandwidth
	 *
	 * canBeNull
	 */
	public OvhPrice total;

	/**
	 * Region
	 *
	 * canBeNull
	 */
	public String region;
}
