package net.minidev.ovh.api.telephony;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Previous tollfree bill
 */
public class OvhHistoryTollfreeConsumption {
	/**
	 * date of the bill
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * the amount which is paid by the called number
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice price;

	/**
	 * status of the bill
	 *
	 * canBeNull && readOnly
	 */
	public OvhBillStatusEnum status;
}
