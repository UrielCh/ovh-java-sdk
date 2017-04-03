package net.minidev.ovh.api.dedicated.server;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * A structure describing informations about server memory
 */
public class OvhRtmMemory {
	/**
	 * Memory slot
	 *
	 * canBeNull
	 */
	public String slot;

	/**
	 * Memory capacity
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> capacity;
}
