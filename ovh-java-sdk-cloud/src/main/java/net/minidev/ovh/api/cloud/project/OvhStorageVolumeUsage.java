package net.minidev.ovh.api.cloud.project;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Storage volume used on your project
 */
public class OvhStorageVolumeUsage {
	/**
	 * Cost for your storage bandwidth
	 *
	 * canBeNull
	 */
	public OvhPrice total;

	/**
	 * Bytes stored in your containers
	 *
	 * canBeNull
	 */
	public Long storedBytes;

	/**
	 * Region
	 *
	 * canBeNull
	 */
	public String region;
}
