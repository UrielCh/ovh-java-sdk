package net.minidev.ovh.api.hosting.privatedatabase;

/**
 * Description for available order capacities following an offer
 */
public class OvhAvailableOrderCapacities {
	/**
	 * Offer
	 *
	 * canBeNull
	 */
	public OvhOfferEnum offer;

	/**
	 * A list of datacenter available for this offer
	 *
	 * canBeNull
	 */
	public OvhDatacenterEnum[] datacenter;

	/**
	 * A list of version available for this offer
	 *
	 * canBeNull
	 */
	public OvhAvailableVersionEnum[] version;

	/**
	 * A list of ram size available for this offer
	 *
	 * canBeNull
	 */
	public OvhAvailableRamSizeEnum[] ram;
}
