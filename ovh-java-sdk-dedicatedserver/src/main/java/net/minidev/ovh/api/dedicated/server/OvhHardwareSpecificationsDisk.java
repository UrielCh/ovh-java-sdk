package net.minidev.ovh.api.dedicated.server;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * A structure describing informations about server disks
 */
public class OvhHardwareSpecificationsDisk {
	/**
	 * disk capacity
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> diskSize;

	/**
	 * default hardware raid size for this disk group
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> defaultHardwareRaidSize;

	/**
	 * human readable description of this disk group
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * default hardware raid type for this disk group
	 *
	 * canBeNull
	 */
	public OvhHardwareSpecificationsRaidHardEnum defaultHardwareRaidType;

	/**
	 * raid controller, if any, managing this group of disks
	 *
	 * canBeNull
	 */
	public String raidController;

	/**
	 * type of the disk (SSD, SATA, SAS, ...)
	 *
	 * canBeNull
	 */
	public String diskType;

	/**
	 * identifier of this disk group
	 *
	 * canBeNull
	 */
	public Long diskGroupId;

	/**
	 * number of disks in this group
	 *
	 * canBeNull
	 */
	public Long numberOfDisks;
}
