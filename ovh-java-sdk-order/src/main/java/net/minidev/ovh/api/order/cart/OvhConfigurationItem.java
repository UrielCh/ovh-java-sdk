package net.minidev.ovh.api.order.cart;

/**
 * Representation of a configuration item for personalizing product
 */
public class OvhConfigurationItem {
	/**
	 * Configuration ID
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Identifier of the resource
	 *
	 * canBeNull && readOnly
	 */
	public String label;

	/**
	 * Path to the resource in API.OVH.COM
	 *
	 * canBeNull && readOnly
	 */
	public String value;
}
