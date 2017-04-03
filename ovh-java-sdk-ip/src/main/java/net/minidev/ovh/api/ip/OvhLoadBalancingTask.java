package net.minidev.ovh.api.ip;

import java.util.Date;

/**
 * List of tasks associated with your IP load balancing
 */
public class OvhLoadBalancingTask {
	/**
	 * The action made
	 *
	 * canBeNull && readOnly
	 */
	public OvhLoadBalancingTaskActionEnum action;

	/**
	 * Identifier of your task
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
	public String status;
}
