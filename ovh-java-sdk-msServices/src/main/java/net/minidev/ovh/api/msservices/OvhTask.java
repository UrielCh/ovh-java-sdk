package net.minidev.ovh.api.msservices;

import java.util.Date;

/**
 * Active Directory task details
 */
public class OvhTask {
	/**
	 * Function name
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskFunctionEnum function;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date todoDate;

	/**
	 * Completion date
	 *
	 * canBeNull && readOnly
	 */
	public Date finishDate;

	/**
	 * Task id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Task status
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStatusEnum status;
}
