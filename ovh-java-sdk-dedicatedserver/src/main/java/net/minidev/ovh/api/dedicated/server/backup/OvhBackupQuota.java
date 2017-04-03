package net.minidev.ovh.api.dedicated.server.backup;

/**
 * A structure describing quota associated to the current container
 */
public class OvhBackupQuota {
	/**
	 * The space currently used on your cloud backup in gigabytes.
	 *
	 * canBeNull
	 */
	public Long usageGB;

	/**
	 * Container quota in gigabytes.
	 *
	 * canBeNull
	 */
	public Long maxSizeGB;

	/**
	 * Cumulated read/write bandwidth in gigabytes per month for the container.
	 *
	 * canBeNull
	 */
	public Long freeBandwidthGB;
}
