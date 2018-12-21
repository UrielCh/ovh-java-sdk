package net.minidev.ovh.api.dedicated;

/**
 * ovh Nas HA offer availabilities
 */
public class OvhNasHAAvailabilities {
	/**
	 * Zone of the DC
	 *
	 * canBeNull
	 */
	public OvhNasHAAvailabilityDatacenter[] datacenters;

	/**
	 * Name of the offer
	 *
	 * canBeNull
	 */
	public OvhNasHAOfferEnum offer;
}
