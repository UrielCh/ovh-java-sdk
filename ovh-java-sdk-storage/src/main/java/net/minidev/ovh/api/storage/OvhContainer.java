package net.minidev.ovh.api.storage;

/**
 * 
 */
public class OvhContainer {
	/**
	 * Total bytes stored
	 *
	 * canBeNull && readOnly
	 */
	public int stored;

	/**
	 * Container name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Number of objects in container
	 *
	 * canBeNull && readOnly
	 */
	public int totalObjects;

	/**
	 * Container region
	 *
	 * canBeNull && readOnly
	 */
	public String region;
}
