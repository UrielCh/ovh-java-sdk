package net.minidev.ovh.api.dbaas.queue;

/**
 * User
 */
public class OvhUser {
	/**
	 * List of roles this user belongs to
	 *
	 * canBeNull && readOnly
	 */
	public String[] roles;

	/**
	 * User name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * User ID
	 *
	 * canBeNull && readOnly
	 */
	public String id;
}
