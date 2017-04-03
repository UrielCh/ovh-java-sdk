package net.minidev.ovh.api.dedicated.server;

/**
 * Hdd replace support request details. 
 */
public class OvhSupportReplaceHddInfo {
	/**
	 * Disk serial number
	 *
	 * canBeNull
	 */
	public String disk_serial;

	/**
	 * Disk slotId (if any)
	 *
	 * canBeNull
	 */
	public Long slot_id;
}
