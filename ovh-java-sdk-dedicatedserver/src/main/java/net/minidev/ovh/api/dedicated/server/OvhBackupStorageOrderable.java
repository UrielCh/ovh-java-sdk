package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing informations storage backup orderable for this dedicated server
 */
public class OvhBackupStorageOrderable {
	/**
	 * Is a backup storage is orderable for this server
	 *
	 * canBeNull
	 */
	public Boolean orderable;

	/**
	 * Backup storage orderable capacities in gigabytes
	 *
	 * canBeNull
	 */
	public OvhBackupStorageCapacityEnum[] capacities;
}
