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
	 * Is the portability eligible for this line ?
	 *
	 * canBeNull
	 */
	public Boolean eligible;

	/**
	 * Warnings to consider when eligible, if any
	 *
	 * canBeNull
	 */
	public OvhMessage[] underConditions;
}
