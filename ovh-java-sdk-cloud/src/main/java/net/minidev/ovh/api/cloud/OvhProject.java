package net.minidev.ovh.api.cloud;

import java.util.Date;
import net.minidev.ovh.api.cloud.project.OvhProjectStatus;

/**
 * Project
 */
public class OvhProject {
	/**
	 * Project access
	 *
	 * canBeNull && readOnly
	 */
	public OvhAccessTypeEnum access;

	/**
	 * Project order id
	 *
	 * canBeNull && readOnly
	 */
	public Long orderId;

	/**
	 * Project id
	 *
	 * canBeNull && readOnly
	 */
	public String project_id;

	/**
	 * Description of your project
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Project unleashed
	 *
	 * canBeNull && readOnly
	 */
	public Boolean unleash;

	/**
	 * Project creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Current status
	 *
	 * canBeNull && readOnly
	 */
	public OvhProjectStatus status;
}
