package net.minidev.ovh.api.cloud.billingview;

/**
 * MonthlyInstanceOption
 */
public class OvhMonthlyInstanceOption {
	/**
	 * Instance reference
	 *
	 * canBeNull && readOnly
	 */
	public String reference;

	/**
	 * Total price
	 *
	 * canBeNull && readOnly
	 */
	public Double totalPrice;

	/**
	 * Details about monthly instances
	 *
	 * canBeNull && readOnly
	 */
	public OvhMonthlyInstanceOptionDetail[] details;

	/**
	 * Instance region
	 *
	 * canBeNull && readOnly
	 */
	public String region;
}
