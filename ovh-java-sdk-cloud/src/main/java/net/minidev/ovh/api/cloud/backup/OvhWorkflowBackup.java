package net.minidev.ovh.api.cloud.backup;

import java.util.Date;

/**
 * WorkflowBackup
 */
public class OvhWorkflowBackup {
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
	 * Last execution logs (10 entries maximum)
	 *
	 * canBeNull && readOnly
	 */
	public OvhExecution[] executions;

	/**
	 * Instance id
	 *
	 * canBeNull && readOnly
	 */
	public String instanceId;

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

	/**
	 * Workflow region
	 *
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * Backup name
	 *
	 * canBeNull && readOnly
	 */
	public String backupName;
}
