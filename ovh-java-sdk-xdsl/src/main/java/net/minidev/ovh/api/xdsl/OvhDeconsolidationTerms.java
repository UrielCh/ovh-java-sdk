package net.minidev.ovh.api.xdsl;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Show the deconsolidation terms
 */
public class OvhDeconsolidationTerms {
	/**
	 * Duration of month the access will be engaged
	 *
	 * canBeNull
	 */
	public Double engagement;

	/**
	 * Price to pay
	 *
	 * canBeNull
	 */
	public OvhPrice price;

	/**
	 * New abo price after the deconsolidation
	 *
	 * canBeNull
	 */
	public OvhPrice monthlyPrice;
}
