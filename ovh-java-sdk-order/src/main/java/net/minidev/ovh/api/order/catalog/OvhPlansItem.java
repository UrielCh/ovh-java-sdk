package net.minidev.ovh.api.order.catalog;

/**
 * Describe an item that contains multiple plans
 */
public class OvhPlansItem {
	/**
	 * List of the plans for this catalog
	 *
	 * canBeNull && readOnly
	 */
	public OvhProductPlan[] plans;

	/**
	 * Family of the product
	 *
	 * canBeNull && readOnly
	 */
	public String family;
}
