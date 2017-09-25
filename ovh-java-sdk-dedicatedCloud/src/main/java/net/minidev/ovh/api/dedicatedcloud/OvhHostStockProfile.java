package net.minidev.ovh.api.dedicatedcloud;

/**
 * HostProfiles and their availability
 */
public class OvhHostStockProfile {
	/**
	 * Reference of host profile
	 *
	 * canBeNull
	 */
	public String ref;

	/**
	 * Name of host profile
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * Id of host profile
	 *
	 * canBeNull
	 */
	public Long id;

	/**
	 * Available hosts
	 *
	 * canBeNull
	 */
	public OvhHostStockProcGen[] value;
}
