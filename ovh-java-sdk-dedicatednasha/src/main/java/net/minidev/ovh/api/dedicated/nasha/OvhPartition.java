package net.minidev.ovh.api.dedicated.nasha;

import net.minidev.ovh.api.dedicated.storage.OvhProtocolEnum;

/**
 * Storage zpool partition
 */
public class OvhPartition {
	/**
	 * percentage of partition space used in %
	 *
	 * canBeNull && readOnly
	 */
	public Long partitionCapacity;

	/**
	 * must be nfs cifs or both
	 *
	 * canBeNull && readOnly
	 */
	public OvhProtocolEnum protocol;

	/**
	 * the given name of partition
	 *
	 * canBeNull && readOnly
	 */
	public String partitionName;

	/**
	 * Partition size
	 *
	 * canBeNull && readOnly
	 */
	public Long size;

	/**
	 * percentage of partition space used by snapshots, in %
	 *
	 * canBeNull && readOnly
	 */
	public Long usedBySnapshots;
}
