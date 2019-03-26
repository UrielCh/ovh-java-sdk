package net.minidev.ovh.api.hosting.reseller;

/**
 * Plesk instance type details
 */
public class OvhProductType {
	/**
	 * Number of allowed databases
	 *
	 * canBeNull
	 */
	public Long databases;

	/**
	 * Number of allowed email accounts
	 *
	 * canBeNull
	 */
	public Long emailAccounts;

	/**
	 * Disk size of the instance (in GB)
	 *
	 * canBeNull
	 */
	public Long diskSize;

	/**
	 * Instance's cpu
	 *
	 * canBeNull
	 */
	public String cpu;

	/**
	 * Number of allowed customers
	 *
	 * canBeNull
	 */
	public Long consumers;

	/**
	 * Number of allowed websites
	 *
	 * canBeNull
	 */
	public Long websites;

	/**
	 * Type name
	 *
	 * canBeNull
	 */
	public String type;

	/**
	 * Number of vCore
	 *
	 * canBeNull
	 */
	public Long vCores;

	/**
	 * Instance's ram (in GB)
	 *
	 * canBeNull
	 */
	public Long ram;
}
