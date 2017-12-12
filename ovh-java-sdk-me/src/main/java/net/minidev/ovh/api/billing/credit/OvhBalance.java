package net.minidev.ovh.api.billing.credit;

import java.util.Date;
import net.minidev.ovh.api.billing.credit.balance.OvhExpiringMovement;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Credit balance
 */
public class OvhBalance {
	/**
	 * Balance amount
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice amount;

	/**
	 * Movement expiring soon
	 *
	 * canBeNull && readOnly
	 */
	public OvhExpiringMovement[] expiringSummary;

	/**
	 * Balance name
	 *
	 * canBeNull && readOnly
	 */
	public String balanceName;

	/**
	 * Balance last update
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Balance creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;
}
