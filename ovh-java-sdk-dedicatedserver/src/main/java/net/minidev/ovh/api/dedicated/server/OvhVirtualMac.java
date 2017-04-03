package net.minidev.ovh.api.dedicated.server;

/**
 * A virtual MAC address associated to one or more IPs
 */
public class OvhVirtualMac {
	/**
	 * Virtual MAC address in 00:00:00:00:00:00 format
	 *
	 * canBeNull && readOnly
	 */
	public String macAddress;

	/**
	 * Virtual MAC address type
	 *
	 * canBeNull && readOnly
	 */
	public OvhVmacTypeEnum type;
}
