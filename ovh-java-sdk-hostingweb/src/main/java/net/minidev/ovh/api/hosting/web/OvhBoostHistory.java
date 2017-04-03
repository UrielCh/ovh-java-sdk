package net.minidev.ovh.api.hosting.web;

import java.util.Date;

/**
 * History of your boost requests
 */
public class OvhBoostHistory {
	/**
	 * Offer when the change was made
	 *
	 * canBeNull && readOnly
	 */
	public OvhOfferCapabilitiesEnum offer;

	/**
	 * The date when the change has been requested
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * Account who requested the change
	 *
	 * canBeNull && readOnly
	 */
	public String accountId;

	/**
	 * Boost offer used
	 *
	 * canBeNull && readOnly
	 */
	public OvhOfferCapabilitiesEnum boostOffer;
}
