package net.minidev.ovh.api.dedicated.server.backup;

/**
 * A structure describing the information related to Openstack to reach the container.
 */
public class OvhBackupSwift {
	/**
	 * Auth url.
	 *
	 * canBeNull
	 */
	public String authUrl;

	/**
	 * Openstack password.
	 *
	 * canBeNull
	 */
	public String password;

	/**
	 * Openstack username to use swift.
	 *
	 * canBeNull
	 */
	public String username;
}
