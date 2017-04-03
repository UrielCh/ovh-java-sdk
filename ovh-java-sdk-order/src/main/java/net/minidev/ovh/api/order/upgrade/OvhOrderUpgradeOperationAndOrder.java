package net.minidev.ovh.api.order.upgrade;

import net.minidev.ovh.api.order.OvhOrder;

/**
 * Describes an Operation and the associated Order
 */
public class OvhOrderUpgradeOperationAndOrder {
	/**
	 * Upgrade operation
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperation operation;

	/**
	 * Order placed
	 *
	 * canBeNull && readOnly
	 */
	public OvhOrder order;
}
