package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing informations about orderable IP address
 */
public class OvhIpOrderableDetails {
	/**
	 * Which option is required to order this type of IP
	 *
	 * canBeNull
	 */
	public OvhOptionRequiredEnum optionRequired;

	/**
	 * Total number of prefixes that can be routed to this server
	 *
	 * canBeNull
	 */
	public Long number;

	/**
	 * Total number of IP that can be routed to this server
	 *
	 * canBeNull
	 */
	public Long ipNumber;

	/**
	 * Orderable IP blocks sizes
	 *
	 * canBeNull
	 */
	public OvhIpBlockSizeEnum[] blockSizes;

	/**
	 * this IP type
	 *
	 * canBeNull
	 */
	public OvhIpTypeOrderableEnum type;

	/**
	 * Are those IP included with your offer
	 *
	 * canBeNull
	 */
	public Boolean included;
}
