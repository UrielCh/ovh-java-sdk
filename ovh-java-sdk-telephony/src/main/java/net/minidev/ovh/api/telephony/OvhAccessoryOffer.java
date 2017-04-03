package net.minidev.ovh.api.telephony;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Informations related to a line offer
 */
public class OvhAccessoryOffer {
	/**
	 * Accessory price
	 *
	 * canBeNull
	 */
	public OvhPrice price;

	/**
	 * The accessory name
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * The accessory description
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * An URL to accessory details
	 *
	 * canBeNull
	 */
	public String url;
}
