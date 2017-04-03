package net.minidev.ovh.api.vps;

import net.minidev.ovh.api.vps.disk.OvhStateEnum;
import net.minidev.ovh.api.vps.disk.OvhTypeEnum;

/**
 * Information about a disk of a VPS Virtual Machine
 */
public class OvhDisk {
	/**
	 * The low disk free space threshold in MiB
	 *
	 * canBeNull && readOnly
	 */
	public Long lowFreeSpaceThreshold;

	/**
	 * canBeNull && readOnly
	 */
	public Long size;

	/**
	 * canBeNull && readOnly
	 */
	public Long bandwidthLimit;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * The monitoring state of this disk
	 *
	 * canBeNull && readOnly
	 */
	public Boolean monitoring;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTypeEnum type;
}
