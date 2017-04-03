package net.minidev.ovh.api.dedicated.server;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Disk attached to a RAID controller
 */
public class OvhHardwareRaidDiskGroup {
	/**
	 * Disk names
	 *
	 * canBeNull
	 */
	public String[] names;

	/**
	 * Disk type
	 *
	 * canBeNull
	 */
	public OvhDiskTypeEnum type;

	/**
	 * Disk insterface speed
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<String> speed;

	/**
	 * Disk capacity
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> capacity;
}
