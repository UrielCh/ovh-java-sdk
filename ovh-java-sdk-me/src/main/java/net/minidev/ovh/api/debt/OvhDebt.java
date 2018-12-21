package net.minidev.ovh.api.debt;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * State of a debt
 */
public class OvhDebt {
	/**
	 * Date the debt was created on
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * Original amount of the debt
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice amount;

	/**
	 * The order the debt relates to
	 *
	 * canBeNull && readOnly
	 */
	public Long orderId;

	/**
	 * Reserved amount awaiting payment
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice todoAmount;

	/**
	 * Amount you still owe for that debt
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice dueAmount;

	/**
	 * Unmatured amount for deferred payment term
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice unmaturedAmount;

	/**
	 * If specified, the debt will not be recovered before that date
	 *
	 * canBeNull && readOnly
	 */
	public Date dueDate;

	/**
	 * canBeNull && readOnly
	 */
	public Long debtId;

	/**
	 * Amount currently being processed
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice pendingAmount;
}
