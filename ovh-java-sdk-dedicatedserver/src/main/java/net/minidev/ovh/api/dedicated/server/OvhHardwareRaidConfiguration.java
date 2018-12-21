package net.minidev.ovh.api.dedicated.server;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Simulated result of how the hardware RAID template will be configured on this server
 */
public class OvhHardwareRaidConfiguration {
	/**
	 * RAID mode
	 *
	 * canBeNull
	 */
	public OvhHardwareSpecificationsRaidHardEnum mode;

	/**
	 * Disk capacity
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> diskSize;

	/**
	 * RAID configuration name
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * Size of disk spans on RAID
	 *
	 * canBeNull
	 */
	public Long diskSpanSize;

	/**
	 * Disk count
	 *
	 * canBeNull
	 */
	public Long diskCount;

	/**
	 * RAID controller type
	 *
	 * canBeNull
	 */
	public String type;

	/**
	 * RAID total capacity
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> capacity;
}
