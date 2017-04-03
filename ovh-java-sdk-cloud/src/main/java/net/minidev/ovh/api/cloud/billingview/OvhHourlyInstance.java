package net.minidev.ovh.api.cloud.billingview;

/**
 * HourlyInstance
 */
public class OvhHourlyInstance {
	/**
	 * Instance reference
	 *
	 * canBeNull && readOnly
	 */
	public String reference;

	/**
	 * Hours of run instances
	 *
	 * canBeNull && readOnly
	 */
	public OvhQuantity quantity;

	/**
	 * Total price
	 *
	 * canBeNull && readOnly
	 */
	public Double totalPrice;

	/**
	 * Details about hourly instances
	 *
	 * canBeNull && readOnly
	 */
	public OvhHourlyInstanceDetail[] details;

	/**
	 * Instance region
	 *
	 * canBeNull && readOnly
	 */
	public String region;
}
