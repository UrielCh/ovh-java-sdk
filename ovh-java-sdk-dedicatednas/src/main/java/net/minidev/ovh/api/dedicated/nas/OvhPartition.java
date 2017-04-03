package net.minidev.ovh.api.dedicated.nas;

import net.minidev.ovh.api.dedicated.storage.OvhProtocolEnum;

/**
 * Storage partition
 */
public class OvhPartition {
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
}
