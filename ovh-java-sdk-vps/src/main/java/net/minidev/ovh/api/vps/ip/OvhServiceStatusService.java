package net.minidev.ovh.api.vps.ip;

/**
 * Port and state of a service on an IP
 */
public class OvhServiceStatusService {
	/**
	 * canBeNull
	 */
	public Long port;

	/**
	 * canBeNull
	 */
	public OvhServiceStatusStateEnum state;
}
