package net.minidev.ovh.api.billing.credit.balance;

import java.util.Date;
import net.minidev.ovh.api.billing.credit.balance.movement.OvhSubObject;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Credit balance
 */
public class OvhMovement {
	/**
	 * Movement amount
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice amount;

	/**
	 * Order ID associated to this credit movement
	 *
	 * canBeNull && readOnly
	 */
	public Long orderId;

	/**
	 * Balance name
	 *
	 * canBeNull && readOnly
	 */
	public String balanceName;

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
	 * Movement type
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Movement ID
	 *
	 * canBeNull && readOnly
	 */
	public Long movementId;

	/**
	 * Movement expiration date
	 *
	 * canBeNull && readOnly
	 */
	public Date expirationDate;
}
