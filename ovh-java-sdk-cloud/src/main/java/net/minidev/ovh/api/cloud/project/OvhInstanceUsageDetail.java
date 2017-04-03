package net.minidev.ovh.api.cloud.project;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Instance usage
 */
public class OvhInstanceUsageDetail {
	/**
	 * Reference
	 *
	 * canBeNull
	 */
	public String reference;

	/**
	 * Instance id
	 *
	 * canBeNull
	 */
	public String instanceId;

	/**
	 * Monthly price
	 *
	 * canBeNull
	 */
	public OvhInstanceMonthlyBilling monthly;

	/**
	 * Is monthly billing enabled
	 *
	 * canBeNull
	 */
	public Boolean monthlyBilling;

	/**
	 * Hourly price
	 *
	 * canBeNull
	 */
	public OvhPrice hourly;
}
