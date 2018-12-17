package net.minidev.ovh.api.hosting.privatedatabase;

import java.util.Date;
import net.minidev.ovh.api.complextype.OvhUnitAndValue;
import net.minidev.ovh.api.hosting.privatedatabase.database.OvhUser;

/**
 * Databases
 */
public class OvhDatabase {
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
	 * Users granted to this database
	 *
	 * canBeNull && readOnly
	 */
	public OvhUser[] users;
}
