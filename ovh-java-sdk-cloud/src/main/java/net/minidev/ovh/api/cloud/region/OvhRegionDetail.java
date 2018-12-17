package net.minidev.ovh.api.cloud.region;

/**
 * RegionDetail
 */
public class OvhRegionDetail {
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
	 * Details about openstack services status
	 *
	 * canBeNull && readOnly
	 */
	public OvhOpenstackService[] services;

	/**
	 * Openstack region status
	 *
	 * canBeNull && readOnly
	 */
	public OvhOpenstackRegionStatusEnum status;

	/**
	 * Region continent code
	 *
	 * canBeNull && readOnly
	 */
	public String continentCode;
}
