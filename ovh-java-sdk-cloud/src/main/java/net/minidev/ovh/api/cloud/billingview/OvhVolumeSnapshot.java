package net.minidev.ovh.api.cloud.billingview;

/**
 * VolumeSnapshot
 */
public class OvhVolumeSnapshot {
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
