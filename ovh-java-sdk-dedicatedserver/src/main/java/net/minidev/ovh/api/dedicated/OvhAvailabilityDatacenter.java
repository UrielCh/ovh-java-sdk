package net.minidev.ovh.api.dedicated;

/**
 * A structure describing the hardware availability for each datacenter
 */
public class OvhAvailabilityDatacenter {
	/**
	 * The code of the datacenter
	 *
	 * canBeNull
	 */
	public OvhAvailabilityDatacenterEnum datacenter;

	/**
	 * The availability
	 *
	 * canBeNull
	 */
	public OvhAvailabilityEnum availability;
}
