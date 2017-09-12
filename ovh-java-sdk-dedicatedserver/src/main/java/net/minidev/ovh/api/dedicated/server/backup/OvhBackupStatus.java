package net.minidev.ovh.api.dedicated.server.backup;

/**
 * A structure describing the status of your backup
 */
public class OvhBackupStatus {
	/**
	 * Status code reason (when not ok)
	 *
	 * canBeNull
	 */
	public String reason;

	/**
	 * Status code
	 *
	 * canBeNull
	 */
	public OvhBackupStatusCodeEnum code;
}
