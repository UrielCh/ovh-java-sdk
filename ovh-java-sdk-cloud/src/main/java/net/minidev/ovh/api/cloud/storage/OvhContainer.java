package net.minidev.ovh.api.cloud.storage;

/**
 * Container
 */
public class OvhContainer {
	/**
	 * Total bytes stored
	 *
	 * canBeNull && readOnly
	 */
	public Long storedBytes;

	/**
	 * Storage name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Storage id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Total objects stored
	 *
	 * canBeNull && readOnly
	 */
	public Long storedObjects;

	/**
	 * canBeNull && readOnly
	 */
	public String region;
}
