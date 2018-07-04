package net.minidev.ovh.api.xdsl.templatemodem;

/**
 * DHCP Configuration for Modem Template
 */
public class OvhDHCP {
	/**
	 * Name of the DHCP
	 *
	 * canBeNull
	 */
	public String dhcpName;

	/**
	 * Lease time in seconds of client assigned address (-1 means infinite)
	 *
	 * canBeNull
	 */
	public Long leaseTime;

	/**
	 * Primary DNS servers to be given to the clients
	 *
	 * canBeNull
	 */
	public String primaryDNS;

	/**
	 * First address of the pool assigned by the DHCP
	 *
	 * canBeNull
	 */
	public String startAddress;

	/**
	 * Domain name provided to the clients
	 *
	 * canBeNull
	 */
	public String domainName;

	/**
	 * Secondary DNS servers to be given to the clients
	 *
	 * canBeNull
	 */
	public String secondaryDNS;

	/**
	 * The subnet mask given to the clients
	 *
	 * canBeNull
	 */
	public String subnetMask;

	/**
	 * The default gateway to be given to the clients
	 *
	 * canBeNull
	 */
	public String defaultGateway;

	/**
	 * Last address of the pool assigned by the DHCP
	 *
	 * canBeNull
	 */
	public String endAddress;

	/**
	 * State of the DHCP server of the modem
	 *
	 * canBeNull
	 */
	public Boolean serverEnabled;
}
