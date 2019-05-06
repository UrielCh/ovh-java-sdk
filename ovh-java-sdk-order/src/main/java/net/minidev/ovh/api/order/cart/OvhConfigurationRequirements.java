package net.minidev.ovh.api.order.cart;

/**
 * Information about a configuration
 */
public class OvhConfigurationRequirements {
	/**
	 * Label for your configuration item
	 *
	 * canBeNull && readOnly
	 */
	public String label;

	/**
	 * Indicates if some particular fields have to be inputed during the creation of `type` resource
	 *
	 * canBeNull && readOnly
	 */
	public String[] fields;

	/**
	 * Type of the configuration item
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Indicates if the configuration item is required
	 *
	 * canBeNull && readOnly
	 */
	public Boolean required;
}
