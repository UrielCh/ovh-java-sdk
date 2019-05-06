package net.minidev.ovh.api.cloud;

import net.minidev.ovh.api.cloud.common.OvhVoucherValidity;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Cloud credit
 */
public class OvhCredit {
	/**
	 * Used credit
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice used_credit;

	/**
	 * Total credit
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice total_credit;

	/**
	 * Voucher code
	 *
	 * canBeNull && readOnly
	 */
	public String voucher;

	/**
	 * Credit bill id
	 *
	 * canBeNull && readOnly
	 */
	public String bill;

	/**
	 * Credit description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Credit validity
	 *
	 * canBeNull && readOnly
	 */
	public OvhVoucherValidity validity;

	/**
	 * Credit id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Available credit
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice available_credit;

	/**
	 * Use credits on following products
	 *
	 * canBeNull && readOnly
	 */
	public String[] products;
}
