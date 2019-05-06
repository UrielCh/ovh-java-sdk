package net.minidev.ovh.api.ip;

import java.util.Date;

/**
 * IP tasks
 */
public class OvhIpTask {
	/**
	 * Function name
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskFunctionEnum function;

	/**
	 * last update
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Destination for moveFloatingIp tasks
	 *
	 * canBeNull && readOnly
	 */
	public OvhRoutedTo destination;

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
	 * the id of the task
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

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
	public OvhTaskStatusEnum status;
}
