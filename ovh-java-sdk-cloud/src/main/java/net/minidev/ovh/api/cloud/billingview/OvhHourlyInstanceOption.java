package net.minidev.ovh.api.cloud.billingview;

/**
 * HourlyInstanceOption
 */
public class OvhHourlyInstanceOption {
	/**
	 * Instance reference
	 *
	 * canBeNull && readOnly
	 */
	public String reference;

	/**
	 * Quantity of instance hours running with this option
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
	 * Details about hourly instances option
	 *
	 * canBeNull && readOnly
	 */
	public OvhHourlyInstanceOptionDetail[] details;

	/**
	 * Instance region
	 *
	 * canBeNull && readOnly
	 */
	public String region;
}
