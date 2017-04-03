package net.minidev.ovh.api.dedicated.nasha;

import net.minidev.ovh.api.dedicated.storage.OvhSnapshotEnum;

/**
 * Partition Snapshot
 */
public class OvhSnapshot {
	/**
	 * the interval of snapshot
	 *
	 * canBeNull && readOnly
	 */
	public OvhSnapshotEnum snapshotType;
}
