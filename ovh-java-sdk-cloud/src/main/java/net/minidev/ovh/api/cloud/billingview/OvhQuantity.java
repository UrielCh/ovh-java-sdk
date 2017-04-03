package net.minidev.ovh.api.cloud.billingview;

/**
 * Quantity
 */
public class OvhQuantity {
	/**
	 * Quantity unit
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitQuantity unit;

	/**
	 * Quantity value
	 *
	 * canBeNull && readOnly
	 */
	public Double value;
}
