package net.minidev.ovh.api.cloud.project;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Usage information for current month on your project
 */
public class OvhCurrentUsage {
	/**
	 * Snapshots usage
	 *
	 * canBeNull
	 */
	public OvhSnapshotsUsage snapshots;

	/**
	 * Total cost for the project
	 *
	 * canBeNull
	 */
	public OvhPrice total;

	/**
	 * Instances usage
	 *
	 * canBeNull
	 */
	public OvhInstancesUsage instances;

	/**
	 * Snapshots usage
	 *
	 * canBeNull
	 */
	public OvhSnapshotsUsage volumeSnapshots;

	/**
	 * Volumes usage
	 *
	 * canBeNull
	 */
	public OvhVolumesUsage volumes;

	/**
	 * Storage usage
	 *
	 * canBeNull
	 */
	public OvhStorageUsage storage;
}
