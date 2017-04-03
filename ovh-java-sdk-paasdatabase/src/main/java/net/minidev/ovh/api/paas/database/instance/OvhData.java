package net.minidev.ovh.api.paas.database.instance;

import java.util.Date;

/**
 * State of available php versions for this account
 */
public class OvhData {
	/**
	 * Instance uuid
	 *
	 * canBeNull
	 */
	public String instanceId;

	/**
	 * Instance image
	 *
	 * canBeNull
	 */
	public String imageName;

	/**
	 * Instance offer
	 *
	 * canBeNull
	 */
	public String offerName;

	/**
	 * Instance region
	 *
	 * canBeNull
	 */
	public String regionName;

	/**
	 * Instance last update date
	 *
	 * canBeNull
	 */
	public Date lastUpdate;

	/**
	 * Instance name
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * Instance creation date
	 *
	 * canBeNull
	 */
	public Date creationDate;

	/**
	 * The task id working on this object
	 *
	 * canBeNull
	 */
	public String taskId;

	/**
	 * Instance status
	 *
	 * canBeNull
	 */
	public OvhStatus status;
}
