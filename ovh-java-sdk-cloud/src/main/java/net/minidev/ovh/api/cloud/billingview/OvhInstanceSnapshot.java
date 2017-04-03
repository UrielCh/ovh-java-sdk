package net.minidev.ovh.api.cloud.billingview;

/**
 * InstanceSnapshot
 */
public class OvhInstanceSnapshot {
	/**
	 * GiBh stored
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
