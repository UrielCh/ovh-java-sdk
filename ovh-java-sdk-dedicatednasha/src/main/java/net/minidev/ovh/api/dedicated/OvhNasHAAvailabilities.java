package net.minidev.ovh.api.dedicated;

/**
 * ovh Nas HA offer availabilities
 */
public class OvhNasHAAvailabilities {
	/**
	 * Name of the offer
	 *
	 * canBeNull
	 */
	public OvhNasHAOfferEnum offer;

	/**
	 * Zone of the DC
	 *
	 * canBeNull
	 */
	public OvhNasHAAvailabilityDatacenter[] datacenters;
}
