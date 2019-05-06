package net.minidev.ovh.api.dbaas.logs;

/**
 * Role
 */
public class OvhRole {
	/**
	 * Role UUID
	 *
	 * canBeNull && readOnly
	 */
	public String roleId;

	/**
	 * Role name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Role description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Associated DBaaS Logs option
	 *
	 * canBeNull && readOnly
	 */
	public String optionId;
}
