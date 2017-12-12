package net.minidev.ovh.api.billing.credit.balance;

import java.util.Date;
import net.minidev.ovh.api.billing.credit.balance.movement.OvhSubObject;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Movement expiring soon
 */
public class OvhExpiringMovement {
	/**
	 * Movement amount
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice amount;

	/**
	 * Movement last update
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Object source of this credit movement
	 *
	 * canBeNull && readOnly
	 */
	public OvhSubObject sourceObject;

	/**
	 * Movement creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Movement expiration date
	 *
	 * canBeNull && readOnly
	 */
	public Date expirationDate;
}
