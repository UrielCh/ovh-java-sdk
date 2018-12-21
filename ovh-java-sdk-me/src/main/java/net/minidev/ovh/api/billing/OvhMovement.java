package net.minidev.ovh.api.billing;

import java.util.Date;
import net.minidev.ovh.api.billing.ovhaccount.OvhOperationEnum;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Details about an OVH account
 */
public class OvhMovement {
	/**
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPrice amount;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPrice balance;

	/**
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public OvhOperationEnum operation;

	/**
	 * canBeNull && readOnly
	 */
	public Long movementId;

	/**
	 * canBeNull && readOnly
	 */
	public Long order;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPrice previousBalance;
}
