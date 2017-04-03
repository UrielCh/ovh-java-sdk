package net.minidev.ovh.api.hosting.privatedatabase;

import java.util.Date;
import net.minidev.ovh.api.hosting.privatedatabase.configuration.OvhDetail;
import net.minidev.ovh.api.hosting.privatedatabase.configuration.OvhStatus;

/**
 * Configuration
 */
public class OvhConfiguration {
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
