package net.minidev.ovh.api.dedicated.installationtemplate;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;
import net.minidev.ovh.api.dedicated.OvhTemplateOsFileSystemEnum;
import net.minidev.ovh.api.dedicated.OvhTemplatePartitionTypeEnum;
import net.minidev.ovh.api.dedicated.server.OvhPartitionRaidEnum;

/**
 *  Partitions defined in this partitioning scheme
 */
public class OvhTemplatePartitions {
	/**
	 * size of partition in Mb, 0 => rest of the space
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> size;

	/**
	 * The volume name needed for proxmox distribution
	 *
	 * canBeNull && readOnly
	 */
	public String volumeName;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTemplatePartitionTypeEnum type;

	/**
	 * Partition filesytem
	 *
	 * canBeNull && readOnly
	 */
	public OvhTemplateOsFileSystemEnum filesystem;

	/**
	 * partition mount point
	 *
	 * canBeNull && readOnly
	 */
	public String mountpoint;

	/**
	 * raid partition type
	 *
	 * canBeNull && readOnly
	 */
	public OvhPartitionRaidEnum raid;

	/**
	 * specifies the creation order of the partition on the disk
	 *
	 * canBeNull && readOnly
	 */
	public Long order;
}
