package net.minidev.ovh.api.dedicated.server.backup;

/**
 * A structure describing informations about this dedicated server
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
	public String code;
}
