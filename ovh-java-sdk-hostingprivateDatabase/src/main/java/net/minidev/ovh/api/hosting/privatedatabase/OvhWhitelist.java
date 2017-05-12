package net.minidev.ovh.api.hosting.privatedatabase;

import java.util.Date;
import net.minidev.ovh.api.hosting.privatedatabase.whitelist.OvhStatus;

/**
 * IP whitelisting for your instance
 */
public class OvhWhitelist {
	/**
	 * Authorize this IP to access service port
	 *
	 * canBeNull && readOnly
	 */
	public Boolean service;

	/**
	 * The whitelisted IP in your instance
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * The last update date of this whitelist
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Custom name for your Whitelisted IP
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Authorize this IP to access sftp port
	 *
	 * canBeNull && readOnly
	 */
	public Boolean sftp;

	/**
	 * Creation date of this whitelist
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
	 * Whitelist status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;
}
