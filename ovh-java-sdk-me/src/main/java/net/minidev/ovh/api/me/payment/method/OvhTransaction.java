package net.minidev.ovh.api.me.payment.method;

import java.util.Date;
import net.minidev.ovh.api.me.payment.method.transaction.OvhStatus;
import net.minidev.ovh.api.me.payment.method.transaction.OvhType;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Payment method transaction object
 */
public class OvhTransaction {
	/**
	 * Transaction amount
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice amount;

	/**
	 * Transaction type
	 *
	 * canBeNull && readOnly
	 */
	public OvhType type;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Transaction ID
	 *
	 * canBeNull && readOnly
	 */
	public Long transactionId;

	/**
	 * Transaction status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;
}
