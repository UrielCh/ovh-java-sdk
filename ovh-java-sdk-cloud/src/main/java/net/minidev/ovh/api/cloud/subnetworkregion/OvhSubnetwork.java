package net.minidev.ovh.api.cloud.subnetworkregion;

/**
 * Subnetwork
 */
public class OvhSubnetwork {
	/**
	 * Subnetwork name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * List of ip pools allocated in subnet
	 *
	 * canBeNull && readOnly
	 */
	public OvhIPPool[] ipPools;

	/**
	 * Subnetwork gateway ip
	 *
	 * canBeNull && readOnly
	 */
	public String gateway_ip;

	/**
	 * Subnetwork CIDR
	 *
	 * canBeNull && readOnly
	 */
	public String cidr;

	/**
	 * Subnetwork ID
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Subnetwork IP version
	 *
	 * canBeNull && readOnly
	 */
	public Long version;

	/**
	 * Is DHCP enabled on subnetwork
	 *
	 * canBeNull && readOnly
	 */
	public Boolean dhcpEnabled;
}
