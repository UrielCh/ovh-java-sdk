package net.minidev.ovh.api.cloud.subnetworkregion;

/**
 * Subnetwork
 */
public class OvhSubnetwork {
	/**
	 * List of ip pools allocated in subnet
	 *
	 * canBeNull && readOnly
	 */
	public OvhIPPool[] ipPools;

	/**
	 * Subnetwork name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Subnetwork CIDR
	 *
	 * canBeNull && readOnly
	 */
	public String cidr;

	/**
	 * Subnetwork gateway ip
	 *
	 * canBeNull && readOnly
	 */
	public String gateway_ip;

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
