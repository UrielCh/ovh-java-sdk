package net.minidev.ovh.api.dedicated.server;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Server raid volume port informations
 */
public class OvhRtmRaidVolumePort {
	/**
	 * Port disk
	 *
	 * canBeNull && readOnly
	 */
	public String disk;

	/**
	 * Serial of this port
	 *
	 * canBeNull && readOnly
	 */
	public String serial;

	/**
	 * Raid volume port
	 *
	 * canBeNull && readOnly
	 */
	public String port;

	/**
	 * Raid port synchronization progress
	 *
	 * canBeNull && readOnly
	 */
	public String syncprogress;

	/**
	 * Port model name
	 *
	 * canBeNull && readOnly
	 */
	public String model;

	/**
	 * Port capacity
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Double> capacity;

	/**
	 * Status of this port
	 *
	 * canBeNull && readOnly
	 */
	public OvhRtmRaidStatusEnum status;
}
