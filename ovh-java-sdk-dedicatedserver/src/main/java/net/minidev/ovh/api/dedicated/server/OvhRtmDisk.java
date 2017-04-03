package net.minidev.ovh.api.dedicated.server;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Server disks informations
 */
public class OvhRtmDisk {
	/**
	 * Disk
	 *
	 * canBeNull && readOnly
	 */
	public String disk;

	/**
	 * Disk temperature
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> temperature;

	/**
	 * Disk model
	 *
	 * canBeNull && readOnly
	 */
	public String model;

	/**
	 * Disk capacity
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> capacity;
}
