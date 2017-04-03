package net.minidev.ovh.api.dedicated.housing;

/**
 * A structure describing the Bay`s network configuration
 */
public class OvhNetworkInfo {
	/**
	 * IPv4 network information
	 *
	 * canBeNull
	 */
	public OvhIpInfo ipv4;

	/**
	 * IPv6 network information
	 *
	 * canBeNull
	 */
	public OvhIpInfo ipv6;

	/**
	 * Router related information
	 *
	 * canBeNull
	 */
	public OvhLinkInfo link;
}
