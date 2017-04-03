package net.minidev.ovh.api.pack.xdsl;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Terms to unpack services
 */
public class OvhUnpackTerms {
	/**
	 * Tells whether or not the service can be unpacked
	 *
	 * canBeNull
	 */
	public Boolean isAllowed;

	/**
	 * Renew period in month of the service
	 *
	 * canBeNull
	 */
	public Double renewPeriod;

	/**
	 * The price it will cost when it will be renew
	 *
	 * canBeNull
	 */
	public OvhPrice renewPrice;

	/**
	 * Price bill on the unpack action
	 *
	 * canBeNull
	 */
	public OvhPrice price;
}
