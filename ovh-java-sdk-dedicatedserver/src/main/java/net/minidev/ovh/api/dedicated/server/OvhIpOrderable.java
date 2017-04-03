package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing informations about orderable IP address
 */
public class OvhIpOrderable {
	/**
	 * Orderable IP v4 details
	 *
	 * canBeNull
	 */
	public OvhIpOrderableDetails[] ipv4;

	/**
	 * Orderable IP v6 details
	 *
	 * canBeNull
	 */
	public OvhIpOrderableDetails[] ipv6;
}
