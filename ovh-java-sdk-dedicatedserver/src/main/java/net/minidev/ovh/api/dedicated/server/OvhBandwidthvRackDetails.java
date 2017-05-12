package net.minidev.ovh.api.dedicated.server;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * A structure describing vRack bandwidth informations about this dedicated server
 */
public class OvhBandwidthvRackDetails {
	/**
	 * vrack bandwidth limitation
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> bandwidth;

	/**
	 * bandwidth offer type
	 *
	 * canBeNull
	 */
	public OvhBandwidthvRackTypeEnum type;
}
