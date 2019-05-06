package net.minidev.ovh.api.connectivity.eligibility;

/**
 * Offer eligibility
 */
public class OvhOfferEligibility {
	/**
	 * Activation type list, for copper only
	 *
	 * canBeNull
	 */
	public OvhActivationTypeEnum[] activationTypes;

	/**
	 * Reasons when not eligible, if any
	 *
	 * canBeNull
	 */
	public OvhMessage[] reasons;

	/**
	 * Is the endpoint eligible to this offer ?
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

	/**
	 * Estimated download rate, for copper and non guaranteed offers only
	 *
	 * canBeNull
	 */
	public Double estimatedDownloadRate;

	/**
	 * Estimated upload rate, for copper and non guaranteed offers only
	 *
	 * canBeNull
	 */
	public Double estimatedUploadRate;
}
