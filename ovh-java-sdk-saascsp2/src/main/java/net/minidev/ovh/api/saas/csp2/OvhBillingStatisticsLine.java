package net.minidev.ovh.api.saas.csp2;

/**
 * Billing statistics line.
 */
public class OvhBillingStatisticsLine {
	/**
	 * Name of the Office license.
	 *
	 * canBeNull
	 */
	public String licenceName;

	/**
	 * Id of the Office license.
	 *
	 * canBeNull
	 */
	public Long licenceId;

	/**
	 * Maximum count of simultaneous activated licences.
	 *
	 * canBeNull
	 */
	public Long peakCount;
}
