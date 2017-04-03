package net.minidev.ovh.api.cloud.billingview;

/**
 * HourlyVolumeDetail
 */
public class OvhHourlyVolumeDetail {
	/**
	 * GiBh of volume
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
	 * Volume ID
	 *
	 * canBeNull && readOnly
	 */
	public String volumeId;
}
