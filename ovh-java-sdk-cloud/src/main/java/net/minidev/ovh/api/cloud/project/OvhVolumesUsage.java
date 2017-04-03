package net.minidev.ovh.api.cloud.project;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Volumes usage for current month
 */
public class OvhVolumesUsage {
	/**
	 * Total cost for the volumes
	 *
	 * canBeNull
	 */
	public OvhPrice total;

	/**
	 * Volume usage details
	 *
	 * canBeNull
	 */
	public OvhVolumeUsageDetail[] detail;
}
