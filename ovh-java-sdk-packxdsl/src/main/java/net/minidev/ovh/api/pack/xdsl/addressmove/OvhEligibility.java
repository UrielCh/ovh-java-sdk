package net.minidev.ovh.api.pack.xdsl.addressmove;

import net.minidev.ovh.api.xdsl.eligibility.OvhPortability;

/**
 * Eligibility
 */
public class OvhEligibility {
	/**
	 * The available offers at this address
	 *
	 * canBeNull
	 */
	public OvhOffer[] offers;

	/**
	 * Tells if the current number portability can be kept after the address move. Null if no number were ported.
	 *
	 * canBeNull
	 */
	public OvhPortability keepCurrentPortability;
}
