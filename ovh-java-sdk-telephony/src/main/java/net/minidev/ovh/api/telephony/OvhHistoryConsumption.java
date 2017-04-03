package net.minidev.ovh.api.telephony;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Previous billed consumptions
 */
public class OvhHistoryConsumption {
	/**
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPrice price;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPrice priceOutplan;

	/**
	 * canBeNull && readOnly
	 */
	public OvhBillStatusEnum status;
}
