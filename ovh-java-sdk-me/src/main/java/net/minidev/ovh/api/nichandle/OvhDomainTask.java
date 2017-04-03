package net.minidev.ovh.api.nichandle;

import java.util.Date;
import net.minidev.ovh.api.domain.OvhNicOperationFunctionEnum;
import net.minidev.ovh.api.domain.OvhOperationStatusEnum;

/**
 * Domain tasks
 */
public class OvhDomainTask {
	/**
	 * Function of the task
	 *
	 * canBeNull && readOnly
	 */
	public OvhNicOperationFunctionEnum function;

	/**
	 * Domain of the task
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

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
