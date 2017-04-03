package net.minidev.ovh.api.dedicated.housing;

/**
 * A structure describing informations for High Availability routing service orderable for this housing bay
 */
public class OvhHaRoutingOrderable {
	/**
	 * High Availability routing service offers
	 *
	 * canBeNull
	 */
	public OvhHaRoutingOfferEnum[] offer;

	/**
	 * Is a routing service is orderable for this housing bay
	 *
	 * canBeNull
	 */
	public Boolean orderable;
}
