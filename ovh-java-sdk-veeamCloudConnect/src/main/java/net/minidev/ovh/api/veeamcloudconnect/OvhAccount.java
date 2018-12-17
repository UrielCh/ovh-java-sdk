package net.minidev.ovh.api.veeamcloudconnect;

/**
 * Veeam Cloud Connect account
 */
public class OvhAccount {
	/**
	 * Datacenter where your Cloud is physically located
	 *
	 * canBeNull && readOnly
	 */
	public OvhLocation location;

	/**
	 * Backuped VMs quantity on your account
	 *
	 * canBeNull && readOnly
	 */
	public Long vmCount;

	/**
	 * Your login in the Veeam Cloud Connect interface
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * The commercial offer linked to your veeam cloud connect
	 *
	 * canBeNull && readOnly
	 */
	public OvhOffer productOffer;
}
