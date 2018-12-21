package net.minidev.ovh.api.domain;

import java.util.Date;

/**
 * Tasks associated to domain
 */
public class OvhTask {
	/**
	 * Last update date of the task
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Function of the task
	 *
	 * canBeNull && readOnly
	 */
	public String function;

	/**
	 * Todo date of the task
	 *
	 * canBeNull && readOnly
	 */
	public Date todoDate;

	/**
	 * Comment about the task
	 *
	 * canBeNull && readOnly
	 */
	public String comment;

	/**
	 * Id of the task
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Can accelerate the task
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canAccelerate;

	/**
	 * Creation date of the task
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Done date of the task
	 *
	 * canBeNull && readOnly
	 */
	public Date doneDate;

	/**
	 * Can relaunch the task
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canRelaunch;

	/**
	 * Can cancel the task
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canCancel;

	/**
	 * Status of the task
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperationStatusEnum status;
}
