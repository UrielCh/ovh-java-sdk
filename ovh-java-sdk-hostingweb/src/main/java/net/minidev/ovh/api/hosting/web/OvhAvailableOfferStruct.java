package net.minidev.ovh.api.hosting.web;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Struct which describs an boost offer from a service
 */
public class OvhAvailableOfferStruct {
	/**
	 * Available boost offer
	 *
	 * canBeNull
	 */
	public OvhOfferEnum offer;

	/**
	 * The price in month for this boost offer
	 *
	 * canBeNull
	 */
	public OvhPrice price;
}
