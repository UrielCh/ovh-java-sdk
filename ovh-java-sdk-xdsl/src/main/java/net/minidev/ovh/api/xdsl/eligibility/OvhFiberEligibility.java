package net.minidev.ovh.api.xdsl.eligibility;

/**
 * Fiber Eligibility result
 */
public class OvhFiberEligibility {
	/**
	 * List of fiber offer
	 *
	 * canBeNull
	 */
	public OvhFiberOffer[] offers;

	/**
	 * Eligibility UUID
	 *
	 * canBeNull
	 */
	public String id;
}
