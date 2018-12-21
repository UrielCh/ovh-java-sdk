package net.minidev.ovh.api.telephony;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Fax delivery record
 */
public class OvhFaxConsumption {
	/**
	 * canBeNull && readOnly
	 */
	public Long pages;

	/**
	 * canBeNull && readOnly
	 */
	public String called;

	/**
	 * canBeNull && readOnly
	 */
	public OvhFaxConsumptionWayTypeEnum wayType;

	/**
	 * canBeNull && readOnly
	 */
	public Long consumptionId;

	/**
	 * canBeNull && readOnly
	 */
	public String calling;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPrice priceWithoutTax;

	/**
	 * canBeNull && readOnly
	 */
	public Date creationDatetime;
}
