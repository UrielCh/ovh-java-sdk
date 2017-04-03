package net.minidev.ovh.api.dedicatedcloud;

import net.minidev.ovh.api.dedicatedcloud.backup.OvhBackupDaysEnum;
import net.minidev.ovh.api.dedicatedcloud.backup.OvhOfferTypeEnum;
import net.minidev.ovh.api.dedicatedcloud.backup.OvhStateEnum;

/**
 * Private Cloud Backup Job
 */
public class OvhBackupJob {
	/**
	 * Offer type of the backup job
	 *
	 * canBeNull && readOnly
	 */
	public OvhOfferTypeEnum offerType;

	/**
	 * Name of the virtual Machine
	 *
	 * canBeNull && readOnly
	 */
	public String vmName;

	/**
	 * Backup is encrypted
	 *
	 * canBeNull && readOnly
	 */
	public Boolean encryption;

	/**
	 * List of days your Virtual Machine will be backuped
	 *
	 * canBeNull && readOnly
	 */
	public OvhBackupDaysEnum[] backupDays;

	/**
	 * Disk space allocated to the virtual machine
	 *
	 * canBeNull && readOnly
	 */
	public Double allocatedDisk;

	/**
	 * State of the backup job
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * Number of days before the backup is deleted
	 *
	 * canBeNull && readOnly
	 */
	public Long retentionTime;
}
