package net.minidev.ovh.api.cloud.billingview;

/**
 * HourlyInstanceDetail
 */
public class OvhHourlyInstanceDetail {
	/**
	 * Hours of run instances
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
