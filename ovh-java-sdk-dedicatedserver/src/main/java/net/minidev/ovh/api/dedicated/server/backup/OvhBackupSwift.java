package net.minidev.ovh.api.dedicated.server.backup;

/**
 * A structure describing the information related to Openstack to reach the container.
 */
public class OvhBackupSwift {
	/**
	 * The container name
	 *
	 * canBeNull
	 */
	public String container;

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
	 * Openstack project id to use swift.
	 *
	 * canBeNull
	 */
	public String project;

	/**
	 * The cloud region which the container belongs to.
	 *
	 * canBeNull
	 */
	public String region;

	/**
	 * Openstack username to use swift.
	 *
	 * canBeNull
	 */
	public String username;
}
