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
	 * Voucher code
	 *
	 * canBeNull && readOnly
	 */
	public String voucher;

	/**
	 * Total credit
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice total_credit;

	/**
	 * Credit description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Credit bill id
	 *
	 * canBeNull && readOnly
	 */
	public String bill;

	/**
	 * Credit id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Credit validity
	 *
	 * canBeNull && readOnly
	 */
	public OvhVoucherValidity validity;

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
