package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing IPv6 routing informations about this dedicated server
 */
public class OvhRoutingDetailsIpv6 {
	/**
	 * Server main IP
	 *
	 * canBeNull
	 */
	public Object ip;

	/**
	 * Server gateway
	 *
	 * canBeNull
	 */
	public String gateway;

	/**
	 * Server network
	 *
	 * canBeNull
	 */
	public Object network;
}
