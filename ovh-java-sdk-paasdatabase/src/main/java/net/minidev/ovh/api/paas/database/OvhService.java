package net.minidev.ovh.api.paas.database;

import java.util.Date;

/**
 * PAAS Project
 */
public class OvhService {
	/**
	 * Project last update date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Project custom name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Project creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Project type
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Project id
	 *
	 * canBeNull && readOnly
	 */
	public String projectId;

	/**
	 * Project status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;
}
