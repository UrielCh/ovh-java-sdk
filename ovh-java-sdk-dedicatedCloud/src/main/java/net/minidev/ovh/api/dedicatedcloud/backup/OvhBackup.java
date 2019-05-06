package net.minidev.ovh.api.dedicatedcloud.backup;

import java.util.Date;
import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Details about a backup
 */
public class OvhBackup {
	/**
	 * Offer type of the backup job
	 *
	 * canBeNull
	 */
	public OvhOfferTypeEnum offerType;

	/**
	 * Last successful creation time of the backup job
	 *
	 * canBeNull
	 */
	public Date lastSuccessfulCreationTime;

	/**
	 * Last duration of the backup job
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> lastDuration;

	/**
	 * Last creation time of the backup job
	 *
	 * canBeNull
	 */
	public Date lastCreationTime;

	/**
	 * Last successful duration of the backup job
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> lastSuccessfulDuration;

	/**
	 * Backup is encrypted
	 *
	 * canBeNull
	 */
	public Boolean encryption;

	/**
	 * Disk space allocated to the virtual machine (in GB)
	 *
	 * canBeNull
	 */
	public Double allocatedDisk;

	/**
	 * Last result of the backup job
	 *
	 * canBeNull
	 */
	public OvhJobStateEnum lastResult;

	/**
	 * List of days your Virtual Machine will be backuped
	 *
	 * canBeNull
	 */
	public OvhBackupDaysEnum[] backupDays;

	/**
	 * Restore points of this backup job
	 *
	 * canBeNull
	 */
	public OvhRestorePoint[] restorePoints;

	/**
	 * State of the backup job
	 *
	 * canBeNull
	 */
	public OvhStateEnum state;

	/**
	 * Number of days before the backup is deleted
	 *
	 * canBeNull
	 */
	public Long retentionTime;
}
