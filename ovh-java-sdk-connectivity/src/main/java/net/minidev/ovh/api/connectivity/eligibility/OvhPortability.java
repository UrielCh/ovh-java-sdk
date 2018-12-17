package net.minidev.ovh.api.connectivity.eligibility;

import java.util.Date;

/**
 * Portability details of the line number
 */
public class OvhPortability {
	/**
	 * Date of the end of quarantine, if any
	 *
	 * canBeNull
	 */
	public Date quarantineEndDate;

	/**
	 * Eligibility informations
	 *
	 * canBeNull
	 */
	public OvhPortabilityEligibility eligibility;

	/**
	 * Portability type, if a portability is ongoing
	 *
	 * canBeNull
	 */
	public OvhPortabilityTypeEnum type;
}
