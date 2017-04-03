package net.minidev.ovh.api.telephony;

/**
 * Time conditions options
 */
public class OvhTimeConditionOptions {
	/**
	 * canBeNull && readOnly
	 */
	public OvhTimeConditionsSlotTypeEnum slot1Type;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTimeConditionsSlotTypeEnum unavailableType;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTimeConditionsSlotTypeEnum slot2Type;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTimeConditionsSlotTypeEnum slot3Type;

	/**
	 * canBeNull && readOnly
	 */
	public String slot3Number;

	/**
	 * canBeNull && readOnly
	 */
	public String slot1Number;

	/**
	 * canBeNull && readOnly
	 */
	public String slot2Number;

	/**
	 * canBeNull && readOnly
	 */
	public String unavailableNumber;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTimeConditionsTimeoutEnum timeout;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTimeConditionsGlobalStatusEnum status;
}
