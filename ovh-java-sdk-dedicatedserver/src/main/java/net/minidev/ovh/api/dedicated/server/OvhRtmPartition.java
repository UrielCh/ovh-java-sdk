package net.minidev.ovh.api.dedicated.server;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Server partitions informations
 */
public class OvhRtmPartition {
	/**
	 * Partition mount point
	 *
	 * canBeNull && readOnly
	 */
	public String mountPoint;

	/**
	 * Partition
	 *
	 * canBeNull && readOnly
	 */
	public String partition;

	/**
	 * Partition inode
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> inodeUsage;

	/**
	 * Partition usage
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> usage;
}
