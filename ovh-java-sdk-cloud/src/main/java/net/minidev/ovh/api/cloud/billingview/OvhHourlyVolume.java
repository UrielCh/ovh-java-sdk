package net.minidev.ovh.api.cloud.billingview;

/**
 * HourlyVolume
 */
public class OvhHourlyVolume {
	/**
	 * Total GiBh of volume
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

	/**
	 * Detail about volume consumption
	 *
	 * canBeNull && readOnly
	 */
	public OvhHourlyVolumeDetail[] details;

	/**
	 * Region
	 *
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * Volume type
	 *
	 * canBeNull && readOnly
	 */
	public String type;
}
