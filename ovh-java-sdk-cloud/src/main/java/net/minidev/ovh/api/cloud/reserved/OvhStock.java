package net.minidev.ovh.api.cloud.reserved;

/**
 * Stock
 */
public class OvhStock {
	/**
	 * Flavor name
	 *
	 * canBeNull && readOnly
	 */
	public String flavorName;

	/**
	 * Number of available instances
	 *
	 * canBeNull && readOnly
	 */
	public Long quantity;

	/**
	 * Flavor id
	 *
	 * canBeNull && readOnly
	 */
	public String flavorId;

	/**
	 * Error message, if any
	 *
	 * canBeNull && readOnly
	 */
	public String error;
}
