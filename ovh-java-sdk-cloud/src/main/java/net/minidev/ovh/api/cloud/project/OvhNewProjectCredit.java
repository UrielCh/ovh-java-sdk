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
	 * Credit id
	 *
	 * canBeNull
	 */
	public Long id;

	/**
	 * Credit validity
	 *
	 * canBeNull
	 */
	public OvhVoucherValidity validity;

	/**
	 * Use credits on following products
	 *
	 * canBeNull
	 */
	public String[] products;
}
