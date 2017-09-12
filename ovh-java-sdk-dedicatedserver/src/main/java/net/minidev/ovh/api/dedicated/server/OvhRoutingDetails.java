package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing routing informations about this dedicated server
 */
public class OvhRoutingDetails {
	/**
	 * Ipv4 routing details
	 *
	 * canBeNull
	 */
	public OvhRoutingDetailsIpv4 ipv4;

	/**
	 * Ipv6 routing details
	 *
	 * canBeNull
	 */
	public OvhRoutingDetailsIpv6 ipv6;
}
