package net.minidev.ovh.api.vps;

import java.util.Date;

/**
 * Backup your VPS
 */
public class OvhAutomatedBackup {
	/**
	 * Scheduled time of your daily backup
	 *
	 * canBeNull && readOnly
	 */
	public Date schedule;

	/**
	 * Backup state
	 *
	 * canBeNull && readOnly
	 */
	public OvhBackupStateEnum state;
}
