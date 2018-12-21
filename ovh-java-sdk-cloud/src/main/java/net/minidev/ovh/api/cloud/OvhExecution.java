package net.minidev.ovh.api.cloud;

import java.util.Date;

/**
 * An execution of the backup workflow
 */
public class OvhExecution {
	/**
	 * Last date of cron trigger execution
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
	public OvhExecutionState state;
}
