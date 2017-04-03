package net.minidev.ovh.api.vrack;

/**
 * IP block in vrack
 */
public class OvhIp {
	/**
	 * Where you want your block announced on the network
	 *
	 * canBeNull && readOnly
	 */
	public OvhVrackZoneEnum zone;

	/**
	 * Your IP block
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Your gateway
	 *
	 * canBeNull && readOnly
	 */
	public String gateway;
}
