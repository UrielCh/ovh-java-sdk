package net.minidev.ovh.api.paas.database;

import java.util.Date;
import net.minidev.ovh.api.complextype.OvhUnitAndValue;
import net.minidev.ovh.api.paas.database.instance.database.OvhStatus;
import net.minidev.ovh.api.paas.database.instance.database.OvhUser;

/**
 * Databases
 */
public class OvhInstanceDatabase {
	/**
	 * Database name
	 *
	 * canBeNull && readOnly
	 */
	public String databaseName;

	/**
	 * Space used by the database
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> quotaUsed;

	/**
	 * The number of available dumps associated to this database
	 *
	 * canBeNull && readOnly
	 */
	public Long dumps;

	/**
	 * Time of the next backup ( every day )
	 *
	 * canBeNull && readOnly
	 */
	public Date backupTime;

	/**
	 * Creation date of the database
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * The id of the task working on this object
	 *
	 * canBeNull && readOnly
	 */
	public String taskId;

	/**
	 * Users granted to this database
	 *
	 * canBeNull && readOnly
	 */
	public OvhUser[] users;

	/**
	 * Database status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;
}
