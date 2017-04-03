package net.minidev.ovh.api.secondarydns;

/**
 * A structure describing informations about available nameserver for secondary dns 
 */
public class OvhSecondaryDNSNameServer {
	/**
	 * the name server
	 *
	 * canBeNull
	 */
	public String hostname;

	/**
	 * canBeNull
	 */
	public String ipv6;

	/**
	 * canBeNull
	 */
	public String ip;
}
