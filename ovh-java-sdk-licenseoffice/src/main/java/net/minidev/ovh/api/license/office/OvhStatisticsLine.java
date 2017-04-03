package net.minidev.ovh.api.license.office;

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
	 * Type of the Office license.
	 *
	 * canBeNull
	 */
	public OvhLicenceEnum licenceType;

	/**
	 * Maximum count of simultaneous activated licences.
	 *
	 * canBeNull
	 */
	public Long peakCount;
}
