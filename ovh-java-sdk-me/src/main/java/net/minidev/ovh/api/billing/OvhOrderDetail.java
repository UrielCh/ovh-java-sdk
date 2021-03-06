package net.minidev.ovh.api.billing;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Information about a Bill entry
 */
public class OvhOrderDetail {
	/**
	 * canBeNull && readOnly
	 */
	public OvhPrice unitPrice;

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
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public Boolean cancelled;

	/**
	 * canBeNull && readOnly
	 */
	public Long orderDetailId;
}
