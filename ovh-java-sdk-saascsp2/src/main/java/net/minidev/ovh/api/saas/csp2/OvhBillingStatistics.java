package net.minidev.ovh.api.saas.csp2;

import java.util.Date;

/**
 * Billing statistics for the current period
 */
public class OvhBillingStatistics {
	/**
	 * End of the billing period
	 *
	 * canBeNull
	 */
	public Date endDate;

	/**
	 * List of lines associated to this statistics entity.
	 *
	 * canBeNull
	 */
	public OvhBillingStatisticsLine[] lines;

	/**
	 * Start of the billing period
	 *
	 * canBeNull
	 */
	public Date startDate;
}
