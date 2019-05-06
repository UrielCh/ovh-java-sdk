package net.minidev.ovh.api.hosting.privatedatabase;

import java.util.Date;

/**
 * Dump
 */
public class OvhDump {
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
	public Long dumpId;

	/**
	 * Dump orphan flag ( true if database does not exists )
	 *
	 * canBeNull && readOnly
	 */
	public Boolean orphan;

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
