package net.minidev.ovh.api.cloud.billingview;

/**
 * HourlySnapshot
 */
public class OvhHourlySnapshot {
	/**
	 * Volume snapshot details
	 *
	 * canBeNull && readOnly
	 */
	public OvhVolumeSnapshot volume;

	/**
	 * Instance snapshot details
	 *
	 * canBeNull && readOnly
	 */
	public OvhInstanceSnapshot instance;

	/**
	 * Total price
	 *
	 * canBeNull && readOnly
	 */
	public Double totalPrice;

	/**
	 * Region
	 *
	 * canBeNull && readOnly
	 */
	public String region;
}
