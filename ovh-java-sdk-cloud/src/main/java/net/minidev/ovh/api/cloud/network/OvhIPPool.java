package net.minidev.ovh.api.cloud.network;

/**
 * IPPool
 */
public class OvhIPPool {
	/**
	 * First IP for this region (eg: 192.168.1.12)
	 *
	 * canBeNull && readOnly
	 */
	public String start;

	/**
	 * Last IP for this region (eg: 192.168.1.24)
	 *
	 * canBeNull && readOnly
	 */
	public String end;

	/**
	 * Region where this subnet will be created
	 *
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * Enable DHCP
	 *
	 * canBeNull && readOnly
	 */
	public Boolean dhcp;

	/**
	 * Global network with cidr (eg: 192.168.1.0/24)
	 *
	 * canBeNull && readOnly
	 */
	public String network;
}
