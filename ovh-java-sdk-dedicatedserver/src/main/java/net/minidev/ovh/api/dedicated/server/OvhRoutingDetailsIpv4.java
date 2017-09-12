package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing IPv4 routing informations about this dedicated server
 */
public class OvhRoutingDetailsIpv4 {
	/**
	 * Server main IP
	 *
	 * canBeNull
	 */
	public String ip;

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
	public String network;
}
