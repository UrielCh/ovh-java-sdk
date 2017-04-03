package net.minidev.ovh.api.overthebox;

import java.util.Date;

/**
 * Backup
 */
public class OvhBackup {
	/**
	 * Date of the creation of the backup
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * The id of the backup
	 *
	 * canBeNull && readOnly
	 */
	public String backupId;

	/**
	 * The id of the device action that triggered the backup
	 *
	 * canBeNull && readOnly
	 */
	public String deviceActionId;
}
