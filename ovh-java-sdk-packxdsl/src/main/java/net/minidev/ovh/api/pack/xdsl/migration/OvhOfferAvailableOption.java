package net.minidev.ovh.api.pack.xdsl.migration;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Available option for the offer
 */
public class OvhOfferAvailableOption {
	/**
	 * Number of months paid for
	 *
	 * canBeNull
	 */
	public Long duration;

	/**
	 * Price of an additional slot. You pay this price everytime the duration is expired
	 *
	 * canBeNull
	 */
	public OvhPrice optionalPrice;

	/**
	 * Name of the option
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * Number of optional slots that can be puchased
	 *
	 * canBeNull
	 */
	public Long optional;

	/**
	 * Number of slots included by default in this offer
	 *
	 * canBeNull
	 */
	public Long included;
}
