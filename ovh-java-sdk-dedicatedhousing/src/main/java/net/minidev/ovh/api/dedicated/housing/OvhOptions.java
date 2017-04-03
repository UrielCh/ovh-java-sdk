package net.minidev.ovh.api.dedicated.housing;

/**
 * A structure describing current housing options
 */
public class OvhOptions {
	/**
	 * Is this housing bay have handsneyes service
	 *
	 * canBeNull
	 */
	public Boolean handsneyes;

	/**
	 * Number of APC connected to this housing bay
	 *
	 * canBeNull
	 */
	public Long apcCount;

	/**
	 * High Availability routing service offer
	 *
	 * canBeNull
	 */
	public String highAvailabilityRouting;
}
