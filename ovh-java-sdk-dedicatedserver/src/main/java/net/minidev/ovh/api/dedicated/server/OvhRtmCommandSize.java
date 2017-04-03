package net.minidev.ovh.api.dedicated.server;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * A structure describing informations about RTM
 */
public class OvhRtmCommandSize {
	/**
	 * Memory used by this process
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> memory;

	/**
	 * Complete command line used for starting this process
	 *
	 * canBeNull
	 */
	public String command;
}
