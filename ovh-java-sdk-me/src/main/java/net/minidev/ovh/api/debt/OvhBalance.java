package net.minidev.ovh.api.debt;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Debt balance of the account
 */
public class OvhBalance {
	/**
	 * Amount of debts the account has
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice dueAmount;

	/**
	 * Reserved amount awaiting payment
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice todoAmount;

	/**
	 * Unmatured amount for deferred payment term
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice unmaturedAmount;

	/**
	 * canBeNull && readOnly
	 */
	public Boolean active;

	/**
	 * Amount currently being processed
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice pendingAmount;
}
