package net.minidev.ovh.api.hosting.web;

import java.util.Date;
import net.minidev.ovh.api.complextype.OvhUnitAndValue;
import net.minidev.ovh.api.hosting.web.database.OvhDatabaseTypeEnum;
import net.minidev.ovh.api.hosting.web.database.OvhModeEnum;
import net.minidev.ovh.api.hosting.web.database.OvhStateEnum;
import net.minidev.ovh.api.hosting.web.database.OvhStatusEnum;
import net.minidev.ovh.api.hosting.web.database.OvhSupportedVersionEnum;
import net.minidev.ovh.api.hosting.web.database.OvhVersionEnum;

/**
 * Database
 */
public class OvhDatabase {
	/**
	 * Your database server name
	 *
	 * canBeNull && readOnly
	 */
	public String server;

	/**
	 * Date of the last check quota
	 *
	 * canBeNull && readOnly
	 */
	public Date lastCheck;

	/**
	 * The number of available dumps associated to this database
	 *
	 * canBeNull && readOnly
	 */
	public Long dumps;

	/**
	 * Indicates the current support state of your database version
	 *
	 * canBeNull && readOnly
	 */
	public OvhSupportedVersionEnum versionSupport;

	/**
	 * Type of your database
	 *
	 * canBeNull && readOnly
	 */
	public OvhDatabaseTypeEnum type;

	/**
	 * Database version following the database type
	 *
	 * canBeNull && readOnly
	 */
	public OvhVersionEnum version;

	/**
	 * URL for the graphical user interface
	 *
	 * canBeNull && readOnly
	 */
	public String guiURL;

	/**
	 * Mode of your database
	 *
	 * canBeNull && readOnly
	 */
	public OvhModeEnum mode;

	/**
	 * The port on where to contact this database
	 *
	 * canBeNull && readOnly
	 */
	public Long port;

	/**
	 * Space used
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Double> quotaUsed;

	/**
	 * Database name (like mydb.mysql.db or mydb.postgres.db)
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Database state
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * Space allowed
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Double> quotaSize;

	/**
	 * Database user name
	 *
	 * canBeNull && readOnly
	 */
	public String user;

	/**
	 * The task ID working on this database
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * The database status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
