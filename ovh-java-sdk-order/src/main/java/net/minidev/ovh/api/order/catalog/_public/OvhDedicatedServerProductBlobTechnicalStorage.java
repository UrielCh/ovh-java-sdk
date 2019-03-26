package net.minidev.ovh.api.order.catalog._public;

import net.minidev.ovh.api.order.catalog._public.OvhDedicatedServerProductBlobTechnicalDisk;

/**
 * Describes a Storage technical Blob for a Dedicated Server
 */
public class OvhDedicatedServerProductBlobTechnicalStorage {
	/**
	 * Disk properties
	 *
	 * canBeNull && readOnly
	 */
	public OvhDedicatedServerProductBlobTechnicalDisk[] disks;

	/**
	 * Raid
	 *
	 * canBeNull && readOnly
	 */
	public String raid;
}
