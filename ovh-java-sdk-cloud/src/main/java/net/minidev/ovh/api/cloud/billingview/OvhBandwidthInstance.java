package net.minidev.ovh.api.cloud.billingview;

/**
 * BandwidthInstance
 */
public class OvhBandwidthInstance {
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
