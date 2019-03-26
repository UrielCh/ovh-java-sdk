package net.minidev.ovh.api.dedicated;

/**
 * A structure describing the availabilities of dedicated server
 */
public class OvhDatacenterAvailability {
	/**
	 * The hardware availability for each datacenter
	 *
	 * canBeNull
	 */
	public OvhAvailabilityDatacenter[] datacenters;

	/**
	 * Name of the base hardware
	 *
	 * canBeNull
	 */
	public String server;

	/**
	 * Fully qualified and unique name of the hardware
	 *
	 * canBeNull
	 */
	public String fqn;

	/**
	 * Name of the memory hardware part
	 *
	 * canBeNull
	 */
	public String memory;

	/**
	 * Name of the storage hardware part
	 *
	 * canBeNull
	 */
	public String storage;

	/**
	 * Plan code in which the hardware is involved
	 *
	 * canBeNull
	 */
	public String planCode;
}
