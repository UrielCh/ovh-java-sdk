package net.minidev.ovh.api.dedicated;

/**
 * A structure describing the availabilities of dedicated server
 */
public class OvhAvailabilities {
	/**
	 * The hardware availability for each datacenter which composed a region
	 *
	 * canBeNull
	 */
	public OvhAvailabilityDatacenter[] datacenters;

	/**
	 * Region where is located the hardware
	 *
	 * canBeNull
	 */
	public OvhAvailabilityRegionEnum region;

	/**
	 * Name of the hardware
	 *
	 * canBeNull
	 */
	public String hardware;
}
