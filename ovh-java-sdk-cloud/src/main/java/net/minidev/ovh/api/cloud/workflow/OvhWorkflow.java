package net.minidev.ovh.api.cloud.workflow;

import java.util.Date;

/**
 * Workflow
 */
public class OvhWorkflow {
	/**
	 * Workflow cron pattern
	 *
	 * canBeNull && readOnly
	 */
	public String cron;

	/**
	 * Creation date of the workflow
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * Executions logs
	 *
	 * canBeNull && readOnly
	 */
	public OvhExecution[] executions;

	/**
	 * Workflow name identifier
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Workflow id
	 *
	 * canBeNull && readOnly
	 */
	public String id;
}
