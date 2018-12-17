package net.minidev.ovh.api.cloud.billingview;

/**
 * HourlyInstanceOptionDetail
 */
public class OvhHourlyInstanceOptionDetail {
	/**
	 * Instance ID
	 *
	 * canBeNull && readOnly
	 */
	public String instanceId;

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
}
