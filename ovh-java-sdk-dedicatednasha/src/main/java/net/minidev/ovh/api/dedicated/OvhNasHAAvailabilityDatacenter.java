package net.minidev.ovh.api.dedicated;

/**
 * A structure describing the availability of offer for each datacenter
 */
public class OvhNasHAAvailabilityDatacenter {
	/**
	 * The code of the datacenter
	 *
	 * canBeNull
	 */
	public OvhNasHAZoneEnum datacenter;

	/**
	 * The availability
	 *
	 * canBeNull
	 */
	public OvhNasHAAvailabilityEnum availability;
}
