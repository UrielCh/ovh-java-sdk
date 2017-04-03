package net.minidev.ovh.api.router;

import java.util.Date;

/**
 * Task
 */
public class OvhTask {
	/**
	 * canBeNull && readOnly
	 */
	public OvhTaskFunctionEnum function;

	/**
	 * canBeNull && readOnly
	 */
	public Date finishDate;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTaskStatusEnum status;
}
