package net.minidev.ovh.api.cloud.workflow;

import java.util.Date;

/**
 * Execution
 */
public class OvhExecution {
	/**
	 * Date of cron trigger execution
	 *
	 * canBeNull && readOnly
	 */
	public Date executedAt;

	/**
	 * Information about state
	 *
	 * canBeNull && readOnly
	 */
	public String stateInfo;

	/**
	 * Execution state
	 *
	 * canBeNull && readOnly
	 */
	public OvhExecutionStateEnum state;
}
