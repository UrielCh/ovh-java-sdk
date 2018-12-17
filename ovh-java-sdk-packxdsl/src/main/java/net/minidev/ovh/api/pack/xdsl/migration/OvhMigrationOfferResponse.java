package net.minidev.ovh.api.pack.xdsl.migration;

import net.minidev.ovh.api.connectivity.eligibility.OvhBuilding;

/**
 * List of available Migration offer
 */
public class OvhMigrationOfferResponse {
	/**
	 * Array of offers
	 *
	 * canBeNull
	 */
	public OvhMigrationOffer[] offers;

	/**
	 * Array of buildings
	 *
	 * canBeNull
	 */
	public OvhBuilding[] buildings;
}
