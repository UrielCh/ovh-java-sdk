package net.minidev.ovh.api.billing;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Information about a Deposit entry
 */
public class OvhDepositDetail {
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
	public String depositDetailId;

	/**
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * canBeNull && readOnly
	 */
	public String description;
}
