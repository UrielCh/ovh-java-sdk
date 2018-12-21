package net.minidev.ovh.api.horizonview;

/**
 * Cloud Desktop Infrastructure Datacenter
 */
public class OvhDatacenter {
	/**
	 * Customer interco vlan allows you to communicate between your private infrastructure and your CDI infrastructure throw the vrack.
	 *
	 * canBeNull && readOnly
	 */
	public Long customerIntercoVlanId;

	/**
	 * Customer interco IP allows you to communicate between your private infrastructure and your CDI infrastructure throw the vrack.
	 *
	 * canBeNull && readOnly
	 */
	public String customerIntercoIP;

	/**
	 * Name of the datacenter
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Datacenter ids
	 *
	 * canBeNull && readOnly
	 */
	public Long datacenterId;

	/**
	 * Next hop to contact the private admin network
	 *
	 * canBeNull && readOnly
	 */
	public String adminNetworkNextHop;

	/**
	 * Private network of the admin infrastructure
	 *
	 * canBeNull && readOnly
	 */
	public String adminPrivateNetwork;

	/**
	 * Domain of your Horizon
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Customer interco netmask allows you to communicate between your private infrastructure and your CDI infrastructure throw the vrack.
	 *
	 * canBeNull && readOnly
	 */
	public String customerIntercoMask;

	/**
	 * IP of the VDI Active Directory
	 *
	 * canBeNull && readOnly
	 */
	public String activeDirectoryIP;

	/**
	 * Domain of the admin infrastructure
	 *
	 * canBeNull && readOnly
	 */
	public String adminDomain;
}
