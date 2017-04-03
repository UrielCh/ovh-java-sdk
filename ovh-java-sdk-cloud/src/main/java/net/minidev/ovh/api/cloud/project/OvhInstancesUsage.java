package net.minidev.ovh.api.cloud.project;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Instances usage for current month
 */
public class OvhInstancesUsage {
	/**
	 * Total cost for the instances
	 *
	 * canBeNull
	 */
	public OvhPrice total;

	/**
	 * Instance usage details
	 *
	 * canBeNull
	 */
	public OvhInstanceUsageDetail[] detail;
}
