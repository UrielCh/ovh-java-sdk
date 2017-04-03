package net.minidev.ovh.api.paas.database;

import java.util.Date;
import net.minidev.ovh.api.paas.database.instance.configuration.OvhDetail;
import net.minidev.ovh.api.paas.database.instance.configuration.OvhStatus;

/**
 * Instance configurations
 */
public class OvhInstanceConfiguration {
	/**
	 * Last update date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Configuration full details
	 *
	 * canBeNull && readOnly
	 */
	public OvhDetail[] details;

	/**
	 * Configuration linked task id
	 *
	 * canBeNull && readOnly
	 */
	public String taskId;

	/**
	 * Configuration status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;
}
