package net.minidev.ovh.api.order;

/**
 * Detail of an order
 */
public class OvhOrderDetail {
	/**
	 * canBeNull
	 */
	public OvhOrderDetailTypeEnum detailType;

	/**
	 * canBeNull
	 */
	public OvhPrice unitPrice;

	/**
	 * canBeNull
	 */
	public Long quantity;

	/**
	 * canBeNull
	 */
	public OvhPrice totalPrice;

	/**
	 * canBeNull
	 */
	public String domain;

	/**
	 * canBeNull
	 */
	public String description;
}
