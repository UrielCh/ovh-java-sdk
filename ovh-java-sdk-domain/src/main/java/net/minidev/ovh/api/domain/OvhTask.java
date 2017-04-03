package net.minidev.ovh.api.domain;

import java.util.Date;

/**
 * Tasks associated to domain
 */
public class OvhTask {
	/**
	 * Function of the task
	 *
	 * canBeNull && readOnly
	 */
	public String function;

	/**
	 * Last update date of the task
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

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
	 * Can accelerate the task
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canAccelerate;

	/**
	 * Id of the task
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

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
	 * Status of the task
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperationStatusEnum status;

	/**
	 * Can cancel the task
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canCancel;
}
