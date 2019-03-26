package net.minidev.ovh.api.dedicated;

/**
 * A structure describing the hardware availability for each datacenter
 */
public class OvhAvailabilityDatacenter {
	/**
	 * Datacenter code
	 *
	 * canBeNull
	 */
	public OvhAvailabilityDatacenterEnum datacenter;

	/**
	 * Availability status
	 *
	 * canBeNull
	 */
	public OvhAvailabilityEnum availability;
}
