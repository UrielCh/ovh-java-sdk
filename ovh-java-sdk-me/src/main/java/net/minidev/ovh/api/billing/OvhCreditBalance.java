package net.minidev.ovh.api.billing;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Credit balance applied on an Order
 */
public class OvhCreditBalance {
	/**
	 * Amount applied from the balance
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice amount;

	/**
	 * Credit balance name
	 *
	 * canBeNull && readOnly
	 */
	public String balanceName;
}
