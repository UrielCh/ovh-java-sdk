package net.minidev.ovh.api.dbaas.queue;

/**
 * Role
 */
public class OvhRole {
	/**
	 * List of topics with read access
	 *
	 * canBeNull && readOnly
	 */
	public String[] readAcl;

	/**
	 * Automatically create non-existing topics on read & write operations
	 *
	 * canBeNull && readOnly
	 */
	public Boolean autoCreateAcl;

	/**
	 * Role name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * List of topics with write access
	 *
	 * canBeNull && readOnly
	 */
	public String[] writeAcl;
}
