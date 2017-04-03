package net.minidev.ovh.api.vps;

/**
 * A structure describing characteristics of a VPS model
 */
public class OvhModel {
	/**
	 * canBeNull
	 */
	public String offer;

	/**
	 * canBeNull
	 */
	public Long disk;

	/**
	 * canBeNull
	 */
	public Long memory;

	/**
	 * canBeNull
	 */
	public String name;

	/**
	 * canBeNull
	 */
	public Long vcore;

	/**
	 * canBeNull
	 */
	public String[] datacenter;

	/**
	 * canBeNull
	 */
	public Long maximumAdditionnalIp;

	/**
	 * canBeNull
	 */
	public OvhVpsVersionEnum version;

	/**
	 * canBeNull
	 */
	public OvhVpsOptionEnum[] availableOptions;
}
