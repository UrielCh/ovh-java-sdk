package net.minidev.ovh.api.cloud.billingview;

/**
 * HourlyInstanceBandwidth
 */
public class OvhHourlyInstanceBandwidth {
	/**
	 * Total price
	 *
	 * canBeNull && readOnly
	 */
	public Double totalPrice;

	/**
	 * Instance incoming bandwidth details
	 *
	 * canBeNull && readOnly
	 */
	public OvhBandwidthInstance incomingBandwidth;

	/**
	 * Instance outgoing bandwidth details
	 *
	 * canBeNull && readOnly
	 */
	public OvhBandwidthInstance outgoingBandwidth;

	/**
	 * Region
	 *
	 * canBeNull && readOnly
	 */
	public String region;
}
