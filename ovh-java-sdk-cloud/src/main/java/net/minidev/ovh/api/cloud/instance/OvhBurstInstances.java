package net.minidev.ovh.api.cloud.instance;

/**
 * BurstInstances
 */
public class OvhBurstInstances {
	/**
	 * Flavors availability
	 *
	 * canBeNull && readOnly
	 */
	public OvhBurstInstanceAvailability[] flavors;

	/**
	 * Region name
	 *
	 * canBeNull && readOnly
	 */
	public String region;
}
