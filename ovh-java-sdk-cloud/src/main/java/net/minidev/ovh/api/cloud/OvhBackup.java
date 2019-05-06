package net.minidev.ovh.api.cloud;

import java.util.Date;

/**
 * List your automated backups
 */
public class OvhBackup {
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
	 * Backup name
	 *
	 * canBeNull && readOnly
	 */
	public String backupName;
}
