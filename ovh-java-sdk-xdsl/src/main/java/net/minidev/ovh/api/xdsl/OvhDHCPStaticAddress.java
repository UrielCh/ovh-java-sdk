package net.minidev.ovh.api.xdsl;

/**
 * DHCP Static Address
 */
public class OvhDHCPStaticAddress {
	/**
	 * The MAC address of the device
	 *
	 * canBeNull && readOnly
	 */
	public String MACAddress;

	/**
	 * Name of the DHCP Static lease
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * The IP address of the device
	 *
	 * canBeNull && readOnly
	 */
	public String IPAddress;

	/**
	 * ID of the ongoing todo (NULL if none)
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;
}
