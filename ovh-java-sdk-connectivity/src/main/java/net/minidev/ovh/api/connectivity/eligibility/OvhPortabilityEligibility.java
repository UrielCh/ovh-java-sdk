package net.minidev.ovh.api.connectivity.eligibility;

/**
 * Portability eligibility
 */
public class OvhPortabilityEligibility {
	/**
	 * Reasons when not eligible, if any
	 *
	 * canBeNull
	 */
	public OvhMessage[] reasons;

	/**
	 * Warnings to consider when eligible, if any
	 *
	 * canBeNull
	 */
	public OvhMessage[] underConditions;

	/**
	 * Is the portability eligible for this line ?
	 *
	 * canBeNull
	 */
	public Boolean eligible;
}
