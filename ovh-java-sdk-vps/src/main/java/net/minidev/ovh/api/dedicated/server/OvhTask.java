package net.minidev.ovh.api.dedicated.server;

import java.util.Date;
import net.minidev.ovh.api.dedicated.OvhTaskFunctionEnum;
import net.minidev.ovh.api.dedicated.OvhTaskStatusEnum;

/**
 * Server tasks
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
	public OvhTaskFunctionEnum function;

	/**
	 * Details of this task
	 *
	 * canBeNull && readOnly
	 */
	public String comment;

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
	 * the id of the task
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * Task status
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStatusEnum status;
}
