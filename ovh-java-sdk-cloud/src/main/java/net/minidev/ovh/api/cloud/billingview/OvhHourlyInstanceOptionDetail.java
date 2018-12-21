package net.minidev.ovh.api.cloud.billingview;

/**
 * HourlyInstanceOptionDetail
 */
public class OvhHourlyInstanceOptionDetail {
	/**
	 * Quantity of instance hours running with this option
	 *
	 * canBeNull && readOnly
	 */
	public OvhQuantity quantity;

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
}
