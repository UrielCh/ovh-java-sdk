package net.minidev.ovh.api.paas.database;

import java.util.Date;
import net.minidev.ovh.api.paas.database.instance.grant.OvhStatus;
import net.minidev.ovh.api.paas.database.instance.grant.OvhType;

/**
 * Grants
 */
public class OvhInstanceGrant {
	/**
	 * Grant id
	 *
	 * canBeNull && readOnly
	 */
	public String grantId;

	/**
	 * Database's name for this grant
	 *
	 * canBeNull && readOnly
	 */
	public String databaseName;

	/**
	 * The last update date of this grant
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Grant type
	 *
	 * canBeNull && readOnly
	 */
	public OvhType grantType;

	/**
	 * Creation date of the grant
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * User name to grant
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
	 * Grant status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;
}
