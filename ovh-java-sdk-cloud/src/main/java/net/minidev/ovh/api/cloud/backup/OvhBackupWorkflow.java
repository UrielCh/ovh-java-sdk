package net.minidev.ovh.api.cloud.backup;

import net.minidev.ovh.api.cloud.workflow.OvhWorkflow;

/**
 * BackupWorkflow
 */
public class OvhBackupWorkflow {
	/**
	 * Instance id
	 *
	 * canBeNull && readOnly
	 */
	public String instanceId;

	/**
	 * Openstack cron trigger informations
	 *
	 * canBeNull && readOnly
	 */
	public OvhWorkflow workflow;

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
