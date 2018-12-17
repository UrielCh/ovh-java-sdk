package net.minidev.ovh.api.cloud.regionavailable;

/**
 * Region
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
	 * Region continent code
	 *
	 * canBeNull && readOnly
	 */
	public OvhContinentEnum continentCode;
}
