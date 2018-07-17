package net.minidev.ovh.api.billing.credit.balance;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Movement already booked on orders
 */
public class OvhBookedMovement {
	/**
	 * Movement amount
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice amount;

	/**
	 * Order ID
	 *
	 * canBeNull && readOnly
	 */
	public Long orderId;
}
