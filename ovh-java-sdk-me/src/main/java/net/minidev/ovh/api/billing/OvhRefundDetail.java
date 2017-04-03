package net.minidev.ovh.api.billing;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Information about a Bill entry
 */
public class OvhRefundDetail {
	/**
	 * canBeNull && readOnly
	 */
	public OvhPrice unitPrice;

	/**
	 * canBeNull && readOnly
	 */
	public String reference;

	/**
	 * canBeNull && readOnly
	 */
	public String quantity;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPrice totalPrice;

	/**
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * canBeNull && readOnly
	 */
	public String refundDetailId;

	/**
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public String refundId;
}
