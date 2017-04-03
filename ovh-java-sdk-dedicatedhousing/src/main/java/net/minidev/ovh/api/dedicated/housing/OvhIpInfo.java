package net.minidev.ovh.api.dedicated.housing;

/**
 * A structure describing the Bay's network configuration
 */
public class OvhIpInfo {
	/**
	 * Reserved addresses. You should not use them in your network
	 *
	 * canBeNull
	 */
	public String[] reservedAddresses;

	/**
	 * Network gateway of the bay
	 *
	 * canBeNull
	 */
	public String gateway;

	/**
	 * Network address of the bay
	 *
	 * canBeNull
	 */
	public String network;
}
