package net.minidev.ovh.api.dedicated.server;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Server raid volume information
 */
public class OvhRtmRaidVolume {
	/**
	 * Raid volume name
	 *
	 * canBeNull && readOnly
	 */
	public String volume;

	/**
	 * Raid volume chunks
	 *
	 * canBeNull && readOnly
	 */
	public String chunks;

	/**
	 * Raid volume phys
	 *
	 * canBeNull && readOnly
	 */
	public String phys;

	/**
	 * Raid volume letter
	 *
	 * canBeNull && readOnly
	 */
	public String letter;

	/**
	 * Raid volume synchronization progress
	 *
	 * canBeNull && readOnly
	 */
	public String syncprogress;

	/**
	 * Raid volume stripe
	 *
	 * canBeNull && readOnly
	 */
	public String stripe;

	/**
	 * Raid volume label
	 *
	 * canBeNull && readOnly
	 */
	public String label;

	/**
	 * Raid volume type
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Raid volume capacity
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Double> capacity;

	/**
	 * Raid volume status
	 *
	 * canBeNull && readOnly
	 */
	public OvhRtmRaidStatusEnum status;
}
