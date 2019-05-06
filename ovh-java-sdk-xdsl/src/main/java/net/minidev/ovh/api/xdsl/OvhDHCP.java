package net.minidev.ovh.api.xdsl;

/**
 * DHCP Configuration of the Modem
 */
public class OvhDHCP {
	/**
	 * Name of the DHCP
	 *
	 * canBeNull && readOnly
	 */
	public String dhcpName;

	/**
	 * Lease time in seconds of client assigned address (-1 means infinite)
	 *
	 * canBeNull && readOnly
	 */
	public Long leaseTime;

	/**
	 * Primary DNS servers to be given to the clients
	 *
	 * canBeNull && readOnly
	 */
	public String primaryDNS;

	/**
	 * First address of the pool assigned by the DHCP
	 *
	 * canBeNull && readOnly
	 */
	public String startAddress;

	/**
	 * Domain name provided to the clients
	 *
	 * canBeNull && readOnly
	 */
	public String domainName;

	/**
	 * Secondary DNS servers to be given to the clients
	 *
	 * canBeNull && readOnly
	 */
	public String secondaryDNS;

	/**
	 * The subnet mask given to the clients
	 *
	 * canBeNull && readOnly
	 */
	public String subnetMask;

	/**
	 * The default gateway to be given to the clients
	 *
	 * canBeNull && readOnly
	 */
	public String defaultGateway;

	/**
	 * ID of the ongoing todo (NULL if none)
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * Last address of the pool assigned by the DHCP
	 *
	 * canBeNull && readOnly
	 */
	public String endAddress;

	/**
	 * State of the DHCP server of the modem
	 *
	 * canBeNull && readOnly
	 */
	public Boolean serverEnabled;
}
