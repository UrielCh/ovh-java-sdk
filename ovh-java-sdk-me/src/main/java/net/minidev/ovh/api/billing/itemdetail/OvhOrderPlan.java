package net.minidev.ovh.api.billing.itemdetail;

/**
 * Plan data from order
 */
public class OvhOrderPlan {
	/**
	 * Duration chosen when ordering through /order/cart (ISO 8601)
	 *
	 * canBeNull
	 */
	public String duration;

	/**
	 * Product from /order/cart
	 *
	 * canBeNull
	 */
	public OvhOrderPlanProduct product;

	/**
	 * Pricing mode used when ordering through /order/cart
	 *
	 * canBeNull
	 */
	public String pricingMode;

	/**
	 * Plan code used when ordering through /order/cart
	 *
	 * canBeNull
	 */
	public String code;

	/**
	 * Quantity ordered
	 *
	 * canBeNull
	 */
	public Long quantity;
}
