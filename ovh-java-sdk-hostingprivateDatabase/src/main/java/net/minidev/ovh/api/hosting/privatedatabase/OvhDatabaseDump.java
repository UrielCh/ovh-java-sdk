package net.minidev.ovh.api.hosting.privatedatabase;

import java.util.Date;

/**
 * Dump
 */
public class OvhDatabaseDump {
	/**
	 * Dump of this database name
	 *
	 * canBeNull && readOnly
	 */
	public String databaseName;

	/**
	 * Automatic deletion date of the dump
	 *
	 * canBeNull && readOnly
	 */
	public Date deletionDate;

	/**
	 * Dump id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Creation date of the dump
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Dump url access
	 *
	 * canBeNull && readOnly
	 */
	public String url;
}
