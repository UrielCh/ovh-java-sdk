package net.minidev.ovh.api.paas.database;

import java.util.Date;
import net.minidev.ovh.api.paas.database.instance.user.OvhDatabase;
import net.minidev.ovh.api.paas.database.instance.user.OvhStatus;

/**
 * Users
 */
public class OvhInstanceUser {
	/**
	 * Databases granted for this user
	 *
	 * canBeNull && readOnly
	 */
	public OvhDatabase[] databases;

	/**
	 * The last update date of the user
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

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

	/**
	 * The id of the task working on this object
	 *
	 * canBeNull && readOnly
	 */
	public String taskId;

	/**
	 * User status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;
}
