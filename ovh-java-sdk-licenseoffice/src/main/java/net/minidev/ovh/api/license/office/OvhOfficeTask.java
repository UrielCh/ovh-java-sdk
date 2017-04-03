package net.minidev.ovh.api.license.office;

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
	 * Task state
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStatusEnum status;
}
