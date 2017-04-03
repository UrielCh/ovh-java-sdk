package net.minidev.ovh.api.cloud.quota;

/**
 * VolumeQuotas
 */
public class OvhVolumeQuotas {
	/**
	 * Current used volume gigabytes
	 *
	 * canBeNull && readOnly
	 */
	public Long usedGigabytes;

	/**
	 * Current volumes count
	 *
	 * canBeNull && readOnly
	 */
	public Long volumeCount;

	/**
	 * Maximum total volume capacity allowed in your project
	 *
	 * canBeNull && readOnly
	 */
	public Long maxGigabytes;
}
