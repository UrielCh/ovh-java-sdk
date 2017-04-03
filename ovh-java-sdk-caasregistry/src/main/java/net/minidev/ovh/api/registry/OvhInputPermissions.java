package net.minidev.ovh.api.registry;

import net.minidev.ovh.api.registry.permission.OvhStatus;

/**
 * Permissions of a user over a namespace
 */
public class OvhInputPermissions {
	/**
	 * Whether a user can read images on the namespace
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canRead;

	/**
	 * Whether a user can create images on the namespace
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canWrite;

	/**
	 * Whether a user can delete images on the namespace
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isAdmin;

	/**
	 * User Id
	 *
	 * canBeNull && readOnly
	 */
	public String userId;

	/**
	 * The status of the permission
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;
}
