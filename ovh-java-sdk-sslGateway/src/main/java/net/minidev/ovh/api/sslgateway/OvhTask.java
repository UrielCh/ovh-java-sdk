package net.minidev.ovh.api.sslgateway;

import java.util.Date;

/**
 * SSL Gateway tasks
 */
public class OvhTask {
	/**
	 * The action made
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskActionEnum action;

	/**
	 * Task progress percentage
	 *
	 * canBeNull && readOnly
	 */
	public Long progress;

	/**
	 * Id of the task
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Creation date of your task
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Current status of your task
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStatusEnum status;
}
