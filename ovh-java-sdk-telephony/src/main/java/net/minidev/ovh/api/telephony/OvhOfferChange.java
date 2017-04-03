package net.minidev.ovh.api.telephony;

/**
 * Offer change
 */
public class OvhOfferChange {
	/**
	 * The current offer will be replace by this one on the next renew.
	 *
	 * canBeNull && readOnly
	 */
	public String offer;
}
