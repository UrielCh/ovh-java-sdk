package net.minidev.ovh.api.dedicated.ceph;

/**
 * List of permissions
 */
public class OvhPermissions {
	/**
	 * Read permission
	 *
	 * canBeNull && readOnly
	 */
	public Boolean read;

	/**
	 * Class read permission
	 *
	 * canBeNull && readOnly
	 */
	public Boolean classRead;

	/**
	 * Class write permission
	 *
	 * canBeNull && readOnly
	 */
	public Boolean classWrite;

	/**
	 * Write permission
	 *
	 * canBeNull && readOnly
	 */
	public Boolean write;

	/**
	 * Execute permission
	 *
	 * canBeNull && readOnly
	 */
	public Boolean execute;

	/**
	 * Name of Ceph pool
	 *
	 * canBeNull && readOnly
	 */
	public String poolName;
}
