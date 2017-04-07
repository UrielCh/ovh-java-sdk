package net.minidev.ovh.api.flavor;

/**
 * 
 */
public class OvhFlavor {
	/**
	 * Number of disks
	 *
	 * canBeNull && readOnly
	 */
	public int disk;

	/**
	 * Flavor name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Flavor unique id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Flavor region
	 *
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * Flavor type
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Number of VCPUs
	 *
	 * canBeNull && readOnly
	 */
	public int vcpus;

	/**
	 * RAM quantity (Gio)
	 *
	 * canBeNull && readOnly
	 */
	public int ram;
}
