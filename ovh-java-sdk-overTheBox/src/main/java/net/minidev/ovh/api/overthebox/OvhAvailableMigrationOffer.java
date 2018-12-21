package net.minidev.ovh.api.overthebox;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Migration offer
 */
public class OvhAvailableMigrationOffer {
	/**
	 * Name of the offer
	 *
	 * canBeNull
	 */
	public String offer;

	/**
	 * Monthly price of the new offer
	 *
	 * canBeNull
	 */
	public OvhPrice price;

	/**
	 * Description of the offer
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * Specify if a hardware is available
	 *
	 * canBeNull
	 */
	public Boolean hardwareAvailable;

	/**
	 * Number of months of engagement
	 *
	 * canBeNull
	 */
	public Long engagementMonths;

	/**
	 * Monthly price of the current offer
	 *
	 * canBeNull
	 */
	public OvhPrice currentOfferPrice;
}
