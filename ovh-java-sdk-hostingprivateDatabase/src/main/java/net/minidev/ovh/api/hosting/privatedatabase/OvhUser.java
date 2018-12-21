package net.minidev.ovh.api.hosting.privatedatabase;

import java.util.Date;
import net.minidev.ovh.api.hosting.privatedatabase.user.OvhDatabase;

/**
 * Users
 */
public class OvhUser {
	/**
	 * Databases granted for this user
	 *
	 * canBeNull && readOnly
	 */
	public OvhDatabase[] databases;

	/**
	 * Creation date of the user
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * User name used to connect to your databases
	 *
	 * canBeNull && readOnly
	 */
	public String userName;
}
