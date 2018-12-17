package net.minidev.ovh.api.registry;

import java.util.Date;
import net.minidev.ovh.api.registry.user.OvhStatus;

/**
 * A registry user account
 */
public class OvhUser {
	/**
	 * Date of the resource creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * A general description of the user account
	 *
	 * canBeNull && readOnly
	 */
	public Boolean description;

	/**
	 * The user id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Date of the resource last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;

	/**
	 * The user name
	 *
	 * canBeNull && readOnly
	 */
	public String username;

	/**
	 * The status of the user
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;
}
