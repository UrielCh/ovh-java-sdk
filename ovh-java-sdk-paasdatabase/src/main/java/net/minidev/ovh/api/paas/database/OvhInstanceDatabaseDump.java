package net.minidev.ovh.api.paas.database;

import java.util.Date;
import net.minidev.ovh.api.complextype.OvhUnitAndValue;
import net.minidev.ovh.api.paas.database.dump.OvhStatus;

/**
 * Database Dumps
 */
public class OvhInstanceDatabaseDump {
	/**
	 * Instance id associated to this dump
	 *
	 * canBeNull && readOnly
	 */
	public String instanceId;

	/**
	 * Dump size
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> size;

	/**
	 * Database name associated to this dump
	 *
	 * canBeNull && readOnly
	 */
	public String databaseName;

	/**
	 * Dump id
	 *
	 * canBeNull && readOnly
	 */
	public String dumpId;

	/**
	 * Dump name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Creation date of the dump
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * The task id working on this object
	 *
	 * canBeNull && readOnly
	 */
	public String[] taskIds;

	/**
	 * email
	 *
	 * canBeNull && readOnly
	 */
	public String email;

	/**
	 * Dump url
	 *
	 * canBeNull && readOnly
	 */
	public String url;

	/**
	 * Dump status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;

	/**
	 * Deletion date of the dump
	 *
	 * canBeNull && readOnly
	 */
	public Date expirationDate;
}
