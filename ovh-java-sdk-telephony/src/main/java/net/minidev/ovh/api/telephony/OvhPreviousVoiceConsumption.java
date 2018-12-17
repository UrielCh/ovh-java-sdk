package net.minidev.ovh.api.telephony;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Call delivery record of the previous month
 */
public class OvhPreviousVoiceConsumption {
	/**
	 * canBeNull && readOnly
	 */
	public Long duration;

	/**
	 * Information about hangup cause
	 *
	 * canBeNull && readOnly
	 */
	public String hangupNature;

	/**
	 * canBeNull && readOnly
	 */
	public OvhVoiceConsumptionPlanTypeEnum planType;

	/**
	 * canBeNull && readOnly
	 */
	public String called;

	/**
	 * Country suffix destination
	 *
	 * canBeNull && readOnly
	 */
	public String countrySuffix;

	/**
	 * canBeNull && readOnly
	 */
	public Long consumptionId;

	/**
	 * canBeNull && readOnly
	 */
	public OvhVoiceConsumptionWayTypeEnum wayType;

	/**
	 * canBeNull && readOnly
	 */
	public String calling;

	/**
	 * canBeNull && readOnly
	 */
	public OvhVoiceConsumptionDestinationTypeEnum destinationType;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPrice priceWithoutTax;

	/**
	 * Description of the destination
	 *
	 * canBeNull && readOnly
	 */
	public String designation;

	/**
	 * canBeNull && readOnly
	 */
	public Date creationDatetime;
}
