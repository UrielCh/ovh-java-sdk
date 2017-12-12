package net.minidev.ovh.api.overthebox;

/**
 * Infos about a network interface
 */
public class OvhDeviceInterface {
	/**
	 * Netmask of the interface
	 *
	 * canBeNull
	 */
	public String netmask;

	/**
	 * IP of the interface
	 *
	 * canBeNull
	 */
	public String ip;

	/**
	 * Name of the interface
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * Public IP of the interface
	 *
	 * canBeNull
	 */
	public String publicIp;

	/**
	 * The DNS servers of this interface
	 *
	 * canBeNull
	 */
	public String[] dnsServers;

	/**
	 * Device of the interface
	 *
	 * canBeNull
	 */
	public String device;

	/**
	 * Gateway of the interface
	 *
	 * canBeNull
	 */
	public String gateway;

	/**
	 * Status of MPTCP on this interface
	 *
	 * canBeNull
	 */
	public OvhMultipathStatusEnum multipathStatus;
}
