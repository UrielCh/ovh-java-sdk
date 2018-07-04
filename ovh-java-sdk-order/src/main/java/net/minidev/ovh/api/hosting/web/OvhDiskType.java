package net.minidev.ovh.api.hosting.web;

/**
 * Disk properties (size and type of disk)
 */
public class OvhDiskType {
	/**
	 * Unit for disk size
	 *
	 * canBeNull
	 */
	public String unit;

	/**
	 * Type of the disk
	 *
	 * canBeNull
	 */
	public OvhDiskTypeEnum type;

	/**
	 * Size of the disk
	 *
	 * canBeNull
	 */
	public Double value;
}
