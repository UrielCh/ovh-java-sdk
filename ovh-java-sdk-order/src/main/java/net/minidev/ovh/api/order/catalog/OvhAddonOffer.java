package net.minidev.ovh.api.order.catalog;

/**
 * Describes of Addon offer
 */
public class OvhAddonOffer {
	/**
	 * Name that appears on invoice
	 *
	 * canBeNull && readOnly
	 */
	public String invoiceName;

	/**
	 * Describes of commercial offer of a product
	 *
	 * canBeNull && readOnly
	 */
	public OvhProductPlan plan;
}
