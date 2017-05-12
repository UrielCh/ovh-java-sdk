package net.minidev.ovh.api.dedicated.server;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * A structure describing network informations about this dedicated server
 */
public class OvhNetworkSpecifications {
	/**
	 * Bandwidth details
	 *
	 * canBeNull
	 */
	public OvhBandwidthDetails bandwidth;

	/**
	 * vRack details
	 *
	 * canBeNull
	 */
	public OvhBandwidthvRackDetails vrack;

	/**
	 * Network connection flow rate
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> connection;

	/**
	 * Traffic details
	 *
	 * canBeNull
	 */
	public OvhTrafficDetails traffic;
}
