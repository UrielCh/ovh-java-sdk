package net.minidev.ovh.api.dedicated.server;

/**
 * RAID controller configuration
 */
public class OvhHardwareRaidController {
	/**
	 * Connected disk type
	 *
	 * canBeNull
	 */
	public OvhHardwareRaidDiskGroup[] disks;

	/**
	 * Raid controler model
	 *
	 * canBeNull
	 */
	public String model;

	/**
	 * Raid controler type
	 *
	 * canBeNull
	 */
	public String type;
}
