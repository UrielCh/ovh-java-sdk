package net.minidev.ovh.api.cloud.billingview;

/**
 * HourlyStorage
 */
public class OvhHourlyStorage {
	/**
	 * Total price
	 *
	 * canBeNull && readOnly
	 */
	public Double totalPrice;

	/**
	 * Information about stored data
	 *
	 * canBeNull && readOnly
	 */
	public OvhStoredStorage stored;

	/**
	 * Storage incoming bandwidth details
	 *
	 * canBeNull && readOnly
	 */
	public OvhBandwidthStorage incomingBandwidth;

	/**
	 * Storage outgoing bandwidth details
	 *
	 * canBeNull && readOnly
	 */
	public OvhBandwidthStorage outgoingBandwidth;

	/**
	 * Storage type
	 *
	 * canBeNull && readOnly
	 */
	public OvhStorageTypeEnum type;

	/**
	 * Region
	 *
	 * canBeNull && readOnly
	 */
	public String region;
}
