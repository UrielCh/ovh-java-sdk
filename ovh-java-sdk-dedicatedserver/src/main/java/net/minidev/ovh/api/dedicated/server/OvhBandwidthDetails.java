package net.minidev.ovh.api.dedicated.server;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * A structure describing bandwidth informations about this dedicated server
 */
public class OvhBandwidthDetails {
	/**
	 * bandwidth limitation OVH to OVH
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> OvhToOvh;

	/**
	 * bandwidth limitation OVH to Internet
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> OvhToInternet;

	/**
	 * bandwidth limitation Internet to OVH
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> InternetToOvh;

	/**
	 * bandwidth offer type
	 *
	 * canBeNull
	 */
	public OvhBandwidthTypeEnum type;
}
