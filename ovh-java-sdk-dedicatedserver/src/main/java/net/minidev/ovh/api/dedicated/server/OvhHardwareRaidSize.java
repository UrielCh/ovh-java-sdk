package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing the server's resulting layout after RAID configuration
 */
public class OvhHardwareRaidSize {
	/**
	 * Hardware RAID configuration list
	 *
	 * canBeNull
	 */
	public OvhHardwareRaidConfiguration[] configurations;
}
