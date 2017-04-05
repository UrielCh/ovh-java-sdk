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
	 * Container name.
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * Sftp connection info
	 *
	 * canBeNull
	 */
	public OvhBackupSftp sftp;

	/**
	 * Container id (can also be used to retrieve the resource in the /cloud api).
	 *
	 * canBeNull
	 */
	public String id;

	/**
	 * The cloud region which the container belongs to.
	 *
	 * canBeNull
	 */
	public String region;

	/**
	 * Swift related information to reach the container
	 *
	 * canBeNull
	 */
	public OvhBackupSwift swift;

	/**
	 * /cloud project which the container belongs to.
	 *
	 * canBeNull
	 */
	public OvhBackupProject cloudProject;
}
