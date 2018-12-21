package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Time condition
 */
public class OvhOvhPabxDialplanExtensionConditionTime {
	/**
	 * The time of the day when the extension will start to be executed
	 *
	 * canBeNull && readOnly
	 */
	public Date timeFrom;

	/**
	 * The time of the day when the extension will stop to be executed
	 *
	 * canBeNull && readOnly
	 */
	public Date timeTo;

	/**
	 * canBeNull && readOnly
	 */
	public Long conditionId;

	/**
	 * The day of the week when the extension will be executed
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhPabxDialplanExtensionConditionTimeWeekDayEnum weekDay;
}
