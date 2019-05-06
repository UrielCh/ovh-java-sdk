package net.minidev.ovh.api.dedicatedcloud;

import java.util.Date;
import net.minidev.ovh.api.dedicatedcloud.backup.OvhOfferTypeEnum;

/**
 * Backup configured on a given Datacenter
 */
public class OvhBackup {
	/**
	 * RestorePoint number on mail report
	 *
	 * canBeNull && readOnly
	 */
	public Boolean restorePointInReport;

	/**
	 * The moref of the backup server virtual machine
	 *
	 * canBeNull && readOnly
	 */
	public String vmwareVmId;

	/**
	 * Backup size on day on email report
	 *
	 * canBeNull && readOnly
	 */
	public Boolean backupSizeInReport;

	/**
	 * Name of the backup server virtual machine.
	 *
	 * canBeNull && readOnly
	 */
	public String hostname;

	/**
	 * Schedule hour for start backup
	 *
	 * canBeNull && readOnly
	 */
	public Date scheduleHour;

	/**
	 * Full day on mail report
	 *
	 * canBeNull && readOnly
	 */
	public Boolean fullDayInReport;

	/**
	 * Backup is encrypted
	 *
	 * canBeNull && readOnly
	 */
	public Boolean encryption;

	/**
	 * Unique additional email address for backup daily report
	 *
	 * canBeNull && readOnly
	 */
	public String mailAddress;

	/**
	 * This Backup current state
	 *
	 * canBeNull && readOnly
	 */
	public OvhBackupStateEnum state;

	/**
	 * Disk size on mail report
	 *
	 * canBeNull && readOnly
	 */
	public Boolean diskSizeInReport;

	/**
	 * Backup offer type
	 *
	 * canBeNull && readOnly
	 */
	public OvhOfferTypeEnum backupOffer;

	/**
	 * Duration on email report
	 *
	 * canBeNull && readOnly
	 */
	public Boolean backupDurationInReport;
}
