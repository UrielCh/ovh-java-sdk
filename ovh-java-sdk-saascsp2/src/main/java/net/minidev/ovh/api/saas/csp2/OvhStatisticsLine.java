package net.minidev.ovh.api.saas.csp2;

/**
 * License usage statistics line.
 */
public class OvhStatisticsLine {
	/**
	 * Count of activated licenses at the end of the day.
	 *
	 * canBeNull
	 */
	public Long endOfDayCount;

	/**
	 * Id of the Office license.
	 *
	 * canBeNull
	 */
	public Long licenceId;

	/**
	 * Name of the Office license.
	 *
	 * canBeNull
	 */
	public String licenceName;

	/**
	 * Maximum count of simultaneous activated licences.
	 *
	 * canBeNull
	 */
	public Long peakCount;
}
