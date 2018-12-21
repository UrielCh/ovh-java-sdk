package net.minidev.ovh.api.domain.zone;

import java.util.Date;
import net.minidev.ovh.api.domain.OvhOperationStatusEnum;

/**
 * Tasks associated to a zone
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
	 * Can relaunch the task
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canRelaunch;

	/**
	 * Done date of the task
	 *
	 * canBeNull && readOnly
	 */
	public Date doneDate;

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
