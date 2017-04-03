package net.minidev.ovh.api.cloud.instance;

/**
 * BurstInstanceAvailability
 */
public class OvhBurstInstanceAvailability {
	/**
	 * Flavor id
	 *
	 * canBeNull && readOnly
	 */
	public String flavor_id;

	/**
	 * Flavor name
	 *
	 * canBeNull && readOnly
	 */
	public String flavor_name;

	/**
	 * Quantity available
	 *
	 * canBeNull && readOnly
	 */
	public Long quantity;
}
