package net.minidev.ovh.api.cloud.project;

import net.minidev.ovh.api.cloud.common.OvhVoucherValidity;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Credit details
 */
public class OvhNewProjectCredit {
	/**
	 * Total credit
	 *
	 * canBeNull
	 */
	public OvhPrice total_credit;

	/**
	 * Credit description
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * Credit validity
	 *
	 * canBeNull
	 */
	public OvhVoucherValidity validity;

	/**
	 * Credit id
	 *
	 * canBeNull
	 */
	public Long id;

	/**
	 * Use credits on following products
	 *
	 * canBeNull
	 */
	public String[] products;
}
