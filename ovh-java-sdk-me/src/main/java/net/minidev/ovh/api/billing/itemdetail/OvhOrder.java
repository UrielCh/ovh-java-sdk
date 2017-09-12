package net.minidev.ovh.api.billing.itemdetail;

/**
 * Order data for this Detail
 */
public class OvhOrder {
	/**
	 * Configurations chosen during the order
	 *
	 * canBeNull
	 */
	public OvhOrderConfiguration[] configurations;

	/**
	 * The meaning of this order detail
	 *
	 * canBeNull
	 */
	public OvhOrderActionEnum action;

	/**
	 * Plan from /order/cart
	 *
	 * canBeNull
	 */
	public OvhOrderPlan plan;
}
