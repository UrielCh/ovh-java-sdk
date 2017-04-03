package net.minidev.ovh.api.cloud.project;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Instance monthly billing details
 */
public class OvhInstanceMonthlyBilling {
	/**
	 * Cost
	 *
	 * canBeNull
	 */
	public OvhPrice cost;

	/**
	 * Monthly billing activation date
	 *
	 * canBeNull
	 */
	public Date activatedOn;
}
