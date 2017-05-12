package net.minidev.ovh.api.license.office;

/**
 * License usage statistic.
 */
public class OvhStatistic {
	/**
	 * Number of available seats in the subscription
	 *
	 * canBeNull
	 */
	public Long available;

	/**
	 * Number of used seats in the subscription
	 *
	 * canBeNull
	 */
	public Long used;

	/**
	 * License type's unique identifier
	 *
	 * canBeNull
	 */
	public Long licenseId;
}
