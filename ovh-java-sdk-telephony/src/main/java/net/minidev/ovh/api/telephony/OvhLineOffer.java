package net.minidev.ovh.api.telephony;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Informations related to a line offer
 */
public class OvhLineOffer {
	/**
	 * Offer price per month
	 *
	 * canBeNull
	 */
	public OvhPrice price;

	/**
	 * The offer name
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * The offer description
	 *
	 * canBeNull
	 */
	public String description;
}
