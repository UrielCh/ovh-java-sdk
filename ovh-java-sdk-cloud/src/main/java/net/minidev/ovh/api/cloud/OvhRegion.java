package net.minidev.ovh.api.cloud;

/**
 * Details about your region
 */
public class OvhRegion {
	/**
	 * Region name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Location of the datacenter where the region is
	 *
	 * canBeNull && readOnly
	 */
	public String datacenterLocation;

	/**
	 * Details about components status
	 *
	 * canBeNull && readOnly
	 */
	public OvhComponent[] services;

	/**
	 * Openstack region status
	 *
	 * canBeNull && readOnly
	 */
	public OvhRegionStatus status;

	/**
	 * Region continent code
	 *
	 * canBeNull && readOnly
	 */
	public OvhRegionContinent continentCode;
}
