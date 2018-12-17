package net.minidev.ovh.api.order;

/**
 * An order
 */
public class OvhOrder {
	/**
	 * canBeNull
	 */
	public Long orderId;

	/**
	 * canBeNull
	 */
	public OvhOrderDetail[] details;

	/**
	 * canBeNull
	 */
	public OvhOrderPrices prices;

	/**
	 * canBeNull
	 */
	public OvhContract[] contracts;

	/**
	 * canBeNull
	 */
	public String url;
}
