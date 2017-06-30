package net.minidev.ovh.api.billing;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Information about a Withdrawal entry
 */
public class OvhWithdrawalDetail {
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
	public String withdrawalDetailId;

	/**
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * canBeNull && readOnly
	 */
	public String description;
}
