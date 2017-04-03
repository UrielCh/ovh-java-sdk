package net.minidev.ovh.api.hosting.web;

import java.util.Date;
import net.minidev.ovh.api.hosting.web.task.OvhStatusEnum;

/**
 * Tasks
 */
public class OvhTask {
	/**
	 * Function name
	 *
	 * canBeNull && readOnly
	 */
	public String function;

	/**
	 * last update
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

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
	 * Task status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
