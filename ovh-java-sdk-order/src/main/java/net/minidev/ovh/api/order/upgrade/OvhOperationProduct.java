package net.minidev.ovh.api.order.upgrade;

/**
 * Describes a product inside a operation
 */
public class OvhOperationProduct {
	/**
	 * Name of the product
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Detailled description of a product
	 *
	 * canBeNull && readOnly
	 */
	public String description;
}
