package net.minidev.ovh.api.billing;

import java.util.Date;
import net.minidev.ovh.api.billing.voucheraccount.OvhOperationEnum;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Details about a voucher account
 */
public class OvhVoucherMovement {
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
	public OvhPrice previousBalance;

	/**
	 * canBeNull && readOnly
	 */
	public Long order;
}
