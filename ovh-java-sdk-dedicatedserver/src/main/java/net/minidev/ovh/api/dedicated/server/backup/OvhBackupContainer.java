package net.minidev.ovh.api.dedicated.server.backup;

/**
 * A structure describing informations about this dedicated server
 */
public class OvhBackupContainer {
	/**
	 * Quota on the current container
	 *
	 * canBeNull
	 */
	public OvhBackupQuota quota;

	/**
	 * Sftp connection info
	 *
	 * canBeNull
	 */
	public OvhBackupSftp sftp;

	/**
	 * Swift related information to reach the container
	 *
	 * canBeNull
	 */
	public OvhBackupSwift swift;
}
