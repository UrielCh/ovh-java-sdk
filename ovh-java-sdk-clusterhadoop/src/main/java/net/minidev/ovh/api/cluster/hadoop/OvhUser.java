package net.minidev.ovh.api.cluster.hadoop;

/**
 * User allowed to access interfaces on your cluster
 */
public class OvhUser {
	/**
	 * Whether or not the User is allowed to access to the WebUI interfaces
	 *
	 * canBeNull && readOnly
	 */
	public Boolean httpFrontend;

	/**
	 * Whether or not the User is allowed to access to the Cloudera Manager interface
	 *
	 * canBeNull && readOnly
	 */
	public Boolean clouderaManager;

	/**
	 * Whether or not the User is allowed to access to the Hue interface
	 *
	 * canBeNull && readOnly
	 */
	public Boolean hue;

	/**
	 * The username of the User
	 *
	 * canBeNull && readOnly
	 */
	public String username;
}
