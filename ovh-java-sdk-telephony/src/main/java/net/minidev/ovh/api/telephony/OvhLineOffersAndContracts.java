package net.minidev.ovh.api.telephony;

import net.minidev.ovh.api.order.OvhContract;

/**
 * Informations related to a line offer
 */
public class OvhLineOffersAndContracts {
	/**
	 * Informations related to a line offer
	 *
	 * canBeNull
	 */
	public OvhLineOffer[] offers;

	/**
	 * Informations related to a line contracts
	 *
	 * canBeNull
	 */
	public OvhContract[] contracts;
}
