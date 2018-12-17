package net.minidev.ovh.api.connectivity.eligibility;

/**
 * Offer
 */
public class OvhOffer {
	/**
	 * Product informations
	 *
	 * canBeNull
	 */
	public OvhOfferProduct product;

	/**
	 * Eligibility result for the offer
	 *
	 * canBeNull
	 */
	public OvhOfferEligibility eligibility;
}
