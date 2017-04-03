package net.minidev.ovh.api.dedicated.server;

import net.minidev.ovh.api.dedicated.server.backup.OvhBackupContainer;

/**
 * Backup Cloud assigned to this server
 */
public class OvhBackupCloud {
	/**
	 * Agreement ids waiting for validation
	 *
	 * canBeNull && readOnly
	 */
	public String[] agreements;

	/**
	 * Archive space info.
	 *
	 * canBeNull && readOnly
	 */
	public OvhBackupContainer archive;

	/**
	 * Storage space info.
	 *
	 * canBeNull && readOnly
	 */
	public OvhBackupContainer storage;

	/**
	 * Status of the container.
	 *
	 * canBeNull && readOnly
	 */
	public String status;
}
