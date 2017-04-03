package net.minidev.ovh.api.cloud.billingview;

/**
 * BandwidthStorage
 */
public class OvhBandwidthStorage {
	/**
	 * Total bandwidth in GiB
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
