package net.minidev.ovh.api.telephony;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Informations related to a telephone offer
 */
public class OvhHardwareOffer {
	/**
	 * Telephony price
	 *
	 * canBeNull
	 */
	public OvhPrice price;

	/**
	 * The telephony name
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * The telephony description
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * An URL to telephony details
	 *
	 * canBeNull
	 */
	public String url;
}
