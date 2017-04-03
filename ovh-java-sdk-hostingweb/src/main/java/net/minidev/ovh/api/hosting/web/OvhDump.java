package net.minidev.ovh.api.hosting.web;

import java.util.Date;
import net.minidev.ovh.api.hosting.web.database.OvhDumpDateEnum;

/**
 * Dump
 */
public class OvhDump {
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
	 * Dump type
	 *
	 * canBeNull && readOnly
	 */
	public OvhDumpDateEnum type;

	/**
	 * Dump url access
	 *
	 * canBeNull && readOnly
	 */
	public String url;
}
