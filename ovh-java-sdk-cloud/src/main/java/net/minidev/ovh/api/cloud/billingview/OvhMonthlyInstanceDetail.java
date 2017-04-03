package net.minidev.ovh.api.cloud.billingview;

import java.util.Date;

/**
 * MonthlyInstanceDetail
 */
public class OvhMonthlyInstanceDetail {
	/**
	 * Instance ID
	 *
	 * canBeNull && readOnly
	 */
	public String instanceId;

	/**
	 * Total price
	 *
	 * canBeNull && readOnly
	 */
	public Double totalPrice;

	/**
	 * Monthly instance activation
	 *
	 * canBeNull && readOnly
	 */
	public Date activation;
}
