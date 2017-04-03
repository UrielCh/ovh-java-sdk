package net.minidev.ovh.api.cloud.billingview;

/**
 * HourlyInstanceDetail
 */
public class OvhHourlyInstanceDetail {
	/**
	 * Instance ID
	 *
	 * canBeNull && readOnly
	 */
	public String instanceId;

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
}
