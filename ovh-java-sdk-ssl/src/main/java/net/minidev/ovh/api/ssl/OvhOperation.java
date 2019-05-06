package net.minidev.ovh.api.ssl;

import java.util.Date;

/**
 * Task on a SSL
 */
public class OvhOperation {
	/**
	 * Task last update
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Task function name
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperationFunctionEnum function;

	/**
	 * Completion date
	 *
	 * canBeNull && readOnly
	 */
	public Date doneDate;

	/**
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
	public OvhOperationStatusEnum status;
}
