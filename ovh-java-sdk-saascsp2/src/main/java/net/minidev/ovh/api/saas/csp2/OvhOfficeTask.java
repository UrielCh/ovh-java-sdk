package net.minidev.ovh.api.saas.csp2;

import java.util.Date;

/**
 * Office task
 */
public class OvhOfficeTask {
	/**
	 * Function name
	 *
	 * canBeNull && readOnly
	 */
	public String function;

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
	 * Unique identifier of the task
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Task state
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStatusEnum status;
}
