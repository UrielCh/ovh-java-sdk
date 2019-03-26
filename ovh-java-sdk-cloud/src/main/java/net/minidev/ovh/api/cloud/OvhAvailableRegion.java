package net.minidev.ovh.api.cloud;

/**
 * Details about an available region that can be activated on your project
 */
public class OvhAvailableRegion {
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
	public OvhRegionContinent continentCode;
}
