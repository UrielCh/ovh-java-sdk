package net.minidev.ovh.api.cloud.reserved;

/**
 * RegionStock
 */
public class OvhRegionStock {
	/**
	 * Stock list by flavor
	 *
	 * canBeNull && readOnly
	 */
	public OvhStock[] flavors;

	/**
	 * Region name
	 *
	 * canBeNull && readOnly
	 */
	public String name;
}
