package net.minidev.ovh.api.instance;

/**
 * 
 */
public class OvhQuota {
	/**
	 * Total cores allowed to create instances
	 *
	 * canBeNull && readOnly
	 */
	public int cores;

	/**
	 * Max instances allowed
	 *
	 * canBeNull && readOnly
	 */
	public int instances;

	/**
	 * Max security groups allowed
	 *
	 * canBeNull && readOnly
	 */
	public int securityGroups;

	/**
	 * Max keypairs allowed
	 *
	 * canBeNull && readOnly
	 */
	public int keypairs;

	/**
	 * Total RAM allowed to create instances
	 *
	 * canBeNull && readOnly
	 */
	public int ram;
}
