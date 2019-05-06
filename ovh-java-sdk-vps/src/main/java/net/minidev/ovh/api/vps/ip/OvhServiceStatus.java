package net.minidev.ovh.api.vps.ip;

/**
 * Service states for an Ip
 */
public class OvhServiceStatus {
	/**
	 * canBeNull
	 */
	public OvhServiceStatusService smtp;

	/**
	 * canBeNull
	 */
	public OvhServiceStatusStateEnum ping;

	/**
	 * canBeNull
	 */
	public OvhServiceStatusService dns;

	/**
	 * canBeNull
	 */
	public OvhServiceStatusService ssh;

	/**
	 * canBeNull
	 */
	public OvhServiceStatusService http;

	/**
	 * canBeNull
	 */
	public OvhServiceStatusService https;

	/**
	 * canBeNull
	 */
	public OvhServiceStatusStateEnum tools;
}
