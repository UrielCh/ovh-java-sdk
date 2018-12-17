package net.minidev.ovh.api.dedicated.server;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * A structure describing informations about server cpu
 */
public class OvhRtmCpu {
	/**
	 * CPU core number
	 *
	 * canBeNull
	 */
	public Long core;

	/**
	 * CPU cache size
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> cache;

	/**
	 * CPU  name
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * CPU frequency
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> freq;
}
