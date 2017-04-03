package net.minidev.ovh.api.dedicated.server;

/**
 * Servers statistics sent by RTM (Real Time Monitoring)
 */
public class OvhRtm {
	/**
	 * You need to update RTM script on your server
	 *
	 * canBeNull && readOnly
	 */
	public Boolean needsUpdate;

	/**
	 * RTM currently installed version
	 *
	 * canBeNull && readOnly
	 */
	public String installedVersion;

	/**
	 * RTM current version
	 *
	 * canBeNull && readOnly
	 */
	public String currentVersion;
}
