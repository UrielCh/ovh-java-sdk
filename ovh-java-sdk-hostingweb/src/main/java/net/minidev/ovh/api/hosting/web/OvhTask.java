package net.minidev.ovh.api.hosting.web;

import java.util.Date;
import net.minidev.ovh.api.hosting.web.task.OvhObjectTypeEnum;
import net.minidev.ovh.api.hosting.web.task.OvhStatusEnum;

/**
 * Tasks
 */
public class OvhTask {
	/**
	 * last update
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Function name
	 *
	 * canBeNull && readOnly
	 */
	public String function;

	/**
	 * the id of the task
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Completion date
	 *
	 * canBeNull && readOnly
	 */
	public Date doneDate;

	/**
	 * Task Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date startDate;

	/**
	 * Task related object ID
	 *
	 * canBeNull && readOnly
	 */
	public String objectId;

	/**
	 * Task status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;

	/**
	 * Task object type
	 *
	 * canBeNull && readOnly
	 */
	public OvhObjectTypeEnum objectType;
}
