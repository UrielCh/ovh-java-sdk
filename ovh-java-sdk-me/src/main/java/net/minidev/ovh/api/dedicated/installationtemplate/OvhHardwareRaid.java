package net.minidev.ovh.api.dedicated.installationtemplate;

import net.minidev.ovh.api.dedicated.OvhTemplateOsHardwareRaidEnum;

/**
 * Hardware RAID defined in this partitioning scheme
 */
public class OvhHardwareRaid {
	/**
	 * RAID mode
	 *
	 * canBeNull && readOnly
	 */
	public OvhTemplateOsHardwareRaidEnum mode;

	/**
	 * Disk list
	 *
	 * canBeNull && readOnly
	 */
	public String[] disks;

	/**
	 * Hardware RAID name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Specifies the creation order of the hardware RAID
	 *
	 * canBeNull && readOnly
	 */
	public Long step;
}
