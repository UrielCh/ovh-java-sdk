package net.minidev.ovh.api.cloud.billingview;

/**
 * MonthlyInstance
 */
public class OvhMonthlyInstance {
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
	public OvhMonthlyInstanceDetail[] details;

	/**
	 * Instance region
	 *
	 * canBeNull && readOnly
	 */
	public String region;
}
