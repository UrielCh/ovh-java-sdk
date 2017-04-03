package net.minidev.ovh.api.iploadbalancing.task;

import java.util.Date;
import net.minidev.ovh.api.iploadbalancing.OvhTaskActionEnum;
import net.minidev.ovh.api.iploadbalancing.OvhTaskStatusEnum;

/**
 * Task of your iplb
 */
public class OvhTask {
	/**
	 * Task progress percentage
	 *
	 * canBeNull && readOnly
	 */
	public Long progress;

	/**
	 * The action made
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskActionEnum action;

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
