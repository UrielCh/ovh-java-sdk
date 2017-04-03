package net.minidev.ovh.api.cloud;

/**
 * A structure defining prices for cloud services
 */
public class OvhPrice {
	/**
	 * Prices for snapshots
	 *
	 * canBeNull
	 */
	public OvhSnapshotPrice[] snapshots;

	/**
	 * canBeNull
	 */
	public OvhFlavorPrice[] instances;

	/**
	 * Price for incoming bandwidth on archive storage
	 *
	 * canBeNull
	 */
	public OvhBandwidthStoragePrice[] bandwidthArchiveIn;

	/**
	 * Price for bandwidth storage
	 *
	 * canBeNull
	 */
	public OvhBandwidthStoragePrice[] bandwidthStorage;

	/**
	 * Price for project creation
	 *
	 * canBeNull
	 */
	public net.minidev.ovh.api.order.OvhPrice projectCreation;

	/**
	 * Price for outgoing bandwidth on archive storage
	 *
	 * canBeNull
	 */
	public OvhBandwidthStoragePrice[] bandwidthArchiveOut;

	/**
	 * Prices for volumes
	 *
	 * canBeNull
	 */
	public OvhVolumePrice[] volumes;

	/**
	 * Price for archive storage
	 *
	 * canBeNull
	 */
	public OvhArchiveStoragePrice[] archive;

	/**
	 * Price for storage
	 *
	 * canBeNull
	 */
	public OvhStoragePrice[] storage;
}
