package net.minidev.ovh.api.saas.csp2;

import java.util.Date;

/**
 * License usage statistics.
 */
public class OvhStatistics {
	/**
	 * Date of the statistics.
	 *
	 * canBeNull
	 */
	public Date date;

	/**
	 * List of lines associated to this statistics entity.
	 *
	 * canBeNull
	 */
	public OvhStatisticsLine[] lines;
}
