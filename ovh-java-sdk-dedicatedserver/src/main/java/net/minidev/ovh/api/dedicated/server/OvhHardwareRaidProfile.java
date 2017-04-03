package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing the server's hardware RAID configuration
 */
public class OvhHardwareRaidProfile {
	/**
	 * Hardware RAID controller list
	 *
	 * canBeNull
	 */
	public OvhHardwareRaidController[] controllers;
}
