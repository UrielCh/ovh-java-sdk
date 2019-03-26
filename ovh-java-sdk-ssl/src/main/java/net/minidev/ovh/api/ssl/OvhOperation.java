package net.minidev.ovh.api.ssl;

import java.util.Date;

/**
 * Task on a SSL
 */
public class OvhOperation {
	/**
	 * Task function name
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperationFunctionEnum function;

	/**
	 * Task last update
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

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
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * Task status
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperationStatusEnum status;
}
