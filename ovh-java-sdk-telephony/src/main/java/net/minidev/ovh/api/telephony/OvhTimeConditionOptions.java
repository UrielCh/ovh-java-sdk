package net.minidev.ovh.api.telephony;

/**
 * Time conditions options
 */
public class OvhTimeConditionOptions {
	/**
	 * Action type executed when the first slot is used
	 *
	 * canBeNull && readOnly
	 */
	public OvhTimeConditionsSlotTypeEnum slot1Type;

	/**
	 * Action type executed when the unavailable slot is used
	 *
	 * canBeNull && readOnly
	 */
	public OvhTimeConditionsSlotTypeEnum unavailableType;

	/**
	 * Action type executed when the second slot is used
	 *
	 * canBeNull && readOnly
	 */
	public OvhTimeConditionsSlotTypeEnum slot2Type;

	/**
	 * Number associated to the third slot action
	 *
	 * canBeNull && readOnly
	 */
	public String slot3Number;

	/**
	 * Action type executed when the third slot is used
	 *
	 * canBeNull && readOnly
	 */
	public OvhTimeConditionsSlotTypeEnum slot3Type;

	/**
	 * Number associated to the first slot action
	 *
	 * canBeNull && readOnly
	 */
	public String slot1Number;

	/**
	 * Number associated to the second slot action
	 *
	 * canBeNull && readOnly
	 */
	public String slot2Number;

	/**
	 * Number associated to the unavailable slot action
	 *
	 * canBeNull && readOnly
	 */
	public String unavailableNumber;

	/**
	 * Timeout value of the time condition
	 *
	 * canBeNull && readOnly
	 */
	public OvhTimeConditionsTimeoutEnum timeout;

	/**
	 * Status of time conditions
	 *
	 * canBeNull && readOnly
	 */
	public OvhTimeConditionsGlobalStatusEnum status;
}
