package net.minidev.ovh.api.hosting.web;

import java.util.Date;
import net.minidev.ovh.api.hosting.web.database.dump.OvhDateEnum;
import net.minidev.ovh.api.hosting.web.database.dump.OvhStatusEnum;

/**
 * Dump
 */
public class OvhDump {
	/**
	 * Source database name
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
	 * If source database was deleted
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
	 * Dump type
	 *
	 * canBeNull && readOnly
	 */
	public OvhDateEnum type;

	/**
	 * The task ID working on this dump
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * Dump url access
	 *
	 * canBeNull && readOnly
	 */
	public String url;

	/**
	 * The dump status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
