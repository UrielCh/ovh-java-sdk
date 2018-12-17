package net.minidev.ovh.api.cloud;

/**
 * A vRack allows to connect your OVH infrastructures accross products and datacenters
 */
public class OvhVrack {
	/**
	 * Name of your vRack
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Description of your vRack
	 *
	 * canBeNull && readOnly
	 */
	public String description;
}
