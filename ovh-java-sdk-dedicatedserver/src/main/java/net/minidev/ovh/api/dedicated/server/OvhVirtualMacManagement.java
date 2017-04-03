package net.minidev.ovh.api.dedicated.server;

/**
 *  ip address linked with this virtual mac address
 */
public class OvhVirtualMacManagement {
	/**
	 * Friendly name of your Virtual Machine behind this IP/MAC
	 *
	 * canBeNull && readOnly
	 */
	public String virtualMachineName;

	/**
	 * IP address
	 *
	 * canBeNull && readOnly
	 */
	public String ipAddress;
}
