package net.minidev.ovh.api.horizonview;

/**
 * Cloud Desktop Infrastructure Datacenter
 */
public class OvhDatacenter {
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
	 * Domain of your Horizon
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;
}
