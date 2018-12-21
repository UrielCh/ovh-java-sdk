package net.minidev.ovh.api.nichandle;

import java.util.Date;
import net.minidev.ovh.api.domain.OvhNicOperationFunctionEnum;
import net.minidev.ovh.api.domain.OvhOperationStatusEnum;

/**
 * Domain tasks
 */
public class OvhDomainTask {
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
	 * Function of the task
	 *
	 * canBeNull && readOnly
	 */
	public OvhNicOperationFunctionEnum function;

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
