package net.minidev.ovh.api.order.catalog._public;

/**
 * Describes a Product attached to a Commercial offer
 */
public class OvhProduct {
	/**
	 * Identifier of the Product
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Description of the Product
	 *
	 * canBeNull && readOnly
	 */
	public String description;
}
