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
	 * Expiration date of your project. After this date, your project will be deleted
	 *
	 * canBeNull && readOnly
	 */
	public Date expiration;

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
	 * Order plan code
	 *
	 * canBeNull && readOnly
	 */
	public String planCode;

	/**
	 * Current status
	 *
	 * canBeNull && readOnly
	 */
	public OvhProjectStatus status;
}
