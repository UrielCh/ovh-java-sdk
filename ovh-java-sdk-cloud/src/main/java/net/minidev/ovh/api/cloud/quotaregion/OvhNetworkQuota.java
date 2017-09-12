package net.minidev.ovh.api.cloud.quotaregion;

/**
 * NetworkQuota
 */
public class OvhNetworkQuota {
	/**
	 * Maximum networks allowed in your project
	 *
	 * canBeNull && readOnly
	 */
	public Long maxNetworks;

	/**
	 * Maximum subnetworks allowed in your project
	 *
	 * canBeNull && readOnly
	 */
	public Long maxSubnetworks;
}
