package net.minidev.ovh.api.paas.database;

import java.util.Date;
import net.minidev.ovh.api.complextype.OvhUnitAndValue;
import net.minidev.ovh.api.paas.database.instance.OvhDisk;
import net.minidev.ovh.api.paas.database.instance.OvhStatus;

/**
 * Instances
 */
public class OvhInstance {
	/**
	 * Instance image
	 *
	 * canBeNull && readOnly
	 */
	public String imageName;

	/**
	 * Instance offer
	 *
	 * canBeNull && readOnly
	 */
	public String offerName;

	/**
	 * Instance region
	 *
	 * canBeNull && readOnly
	 */
	public String regionName;

	/**
	 * If set to TRUE, the instance is currently in overquota state
	 *
	 * canBeNull && readOnly
	 */
	public Boolean overquota;

	/**
	 * Instance creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Instance RAM informations
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Double> ramSize;

	/**
	 * Instance disk informations
	 *
	 * canBeNull && readOnly
	 */
	public OvhDisk disk;

	/**
	 * Instance endpoint
	 *
	 * canBeNull && readOnly
	 */
	public String endpoint;

	/**
	 * Instance uuid
	 *
	 * canBeNull && readOnly
	 */
	public String instanceId;

	/**
	 * Instance ftp port
	 *
	 * canBeNull && readOnly
	 */
	public Long sftpPort;

	/**
	 * Instance last update date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Instance name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Instance service port
	 *
	 * canBeNull && readOnly
	 */
	public Long servicePort;

	/**
	 * The task id working on this object
	 *
	 * canBeNull && readOnly
	 */
	public String taskId;

	/**
	 * Instance status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;
}
