package net.minidev.ovh.api.cloud.network;

/**
 * Subnet
 */
public class OvhSubnet {
	/**
	 * List of ip pools allocated in subnet
	 *
	 * canBeNull && readOnly
	 */
	public OvhIPPool[] ipPools;

	/**
	 * Gateway IP in the subnet
	 *
	 * canBeNull && readOnly
	 */
	public String gatewayIp;

	/**
	 * Subnet CIDR
	 *
	 * canBeNull && readOnly
	 */
	public String cidr;

	/**
	 * Subnet id
	 *
	 * canBeNull && readOnly
	 */
	public String id;
}
