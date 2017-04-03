package net.minidev.ovh.api.cloud.usage;

import java.util.Date;

/**
 * UsageHistory
 */
public class OvhUsageHistory {
	/**
	 * Usage dates (from/to)
	 *
	 * canBeNull && readOnly
	 */
	public OvhPeriod period;

	/**
	 * Entry last update
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Usage id
	 *
	 * canBeNull && readOnly
	 */
	public String id;
}
