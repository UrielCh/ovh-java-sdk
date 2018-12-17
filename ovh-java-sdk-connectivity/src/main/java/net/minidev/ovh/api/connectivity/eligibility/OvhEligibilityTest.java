package net.minidev.ovh.api.connectivity.eligibility;

/**
 * Eligibility test results
 */
public class OvhEligibilityTest {
	/**
	 * Offers informations
	 *
	 * canBeNull
	 */
	public OvhOffer[] offers;

	/**
	 * Endpoint informations
	 *
	 * canBeNull
	 */
	public OvhEndpoint endpoint;

	/**
	 * Eligibility unique reference
	 *
	 * canBeNull
	 */
	public String eligibilityReference;
}
