package net.minidev.ovh.api.pack.xdsl.migration;

import net.minidev.ovh.api.pack.xdsl.OvhServiceNameEnum;

/**
 * Option of Offer
 */
public class OvhOfferServiceToDelete {
	/**
	 * Type of the service
	 *
	 * canBeNull
	 */
	public String service;

	/**
	 * Type of the service to delete
	 *
	 * canBeNull
	 */
	public OvhServiceNameEnum type;
}
