package net.minidev.ovh.api.nichandle;

import java.util.Date;

/**
 * A user
 */
public class OvhUser {
	/**
	 * When the user changed his password for the last time
	 *
	 * canBeNull && readOnly
	 */
	public Date passwordLastUpdate;

	/**
	 * Last update of this user
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * User's description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * User's login suffix
	 *
	 * canBeNull && readOnly
	 */
	public String login;

	/**
	 * Creation date of this user
	 *
	 * canBeNull && readOnly
	 */
	public Date creation;

	/**
	 * User's email
	 *
	 * canBeNull && readOnly
	 */
	public String email;

	/**
	 * User's group
	 *
	 * canBeNull && readOnly
	 */
	public String group;

	/**
	 * Current user's status
	 *
	 * canBeNull && readOnly
	 */
	public OvhUserStatus status;
}
