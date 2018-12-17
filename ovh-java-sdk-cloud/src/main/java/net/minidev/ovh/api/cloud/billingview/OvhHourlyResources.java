package net.minidev.ovh.api.cloud.billingview;

/**
 * HourlyResources
 */
public class OvhHourlyResources {
	/**
	 * Details about hourly volumes
	 *
	 * canBeNull && readOnly
	 */
	public OvhHourlyVolume[] volume;

	/**
	 * Details about hourly instances
	 *
	 * canBeNull && readOnly
	 */
	public OvhHourlyInstance[] instance;

	/**
	 * Details about hourly storage
	 *
	 * canBeNull && readOnly
	 */
	public OvhHourlyStorage[] storage;

	/**
	 * Details about hourly instances options
	 *
	 * canBeNull && readOnly
	 */
	public OvhHourlyInstanceOption[] instanceOption;

	/**
	 * Details about hourly snapshots
	 *
	 * canBeNull && readOnly
	 */
	public OvhHourlySnapshot[] snapshot;
}
