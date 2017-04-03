package net.minidev.ovh.api.cloud.project;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Snapshots usage for current month
 */
public class OvhSnapshotsUsage {
	/**
	 * Total cost for the snapshots
	 *
	 * canBeNull
	 */
	public OvhPrice total;

	/**
	 * Snapshots usage details
	 *
	 * canBeNull
	 */
	public OvhSnapshotUsageDetail[] detail;
}
