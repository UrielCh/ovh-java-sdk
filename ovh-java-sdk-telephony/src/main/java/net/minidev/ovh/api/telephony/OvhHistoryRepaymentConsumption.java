package net.minidev.ovh.api.telephony;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Previous repayment bill
 */
public class OvhHistoryRepaymentConsumption {
	/**
	 * date of the bill
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * the amout which is repayed
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice price;

	/**
	 * the number of the bill
	 *
	 * canBeNull && readOnly
	 */
	public String billingNumber;

	/**
	 * status of the bill
	 *
	 * canBeNull && readOnly
	 */
	public OvhBillStatusEnum status;
}
