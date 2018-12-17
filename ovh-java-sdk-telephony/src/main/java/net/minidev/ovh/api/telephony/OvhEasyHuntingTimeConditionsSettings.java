package net.minidev.ovh.api.telephony;

/**
 * Easy hunting time conditions options
 */
public class OvhEasyHuntingTimeConditionsSettings {
	/**
	 * Action type executed when the first slot is used
	 *
	 * canBeNull && readOnly
	 */
	public OvhTimeConditionsSettingsForwardTypeEnum slot1Type;

	/**
	 * Action type executed when the unavailable slot is used
	 *
	 * canBeNull && readOnly
	 */
	public OvhTimeConditionsSettingsForwardTypeEnum unavailableType;

	/**
	 * Action type executed when the second slot is used
	 *
	 * canBeNull && readOnly
	 */
	public OvhTimeConditionsSettingsForwardTypeEnum slot2Type;

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
	public OvhTimeConditionsSettingsForwardTypeEnum slot3Type;

	/**
	 * Status of time conditions
	 *
	 * canBeNull && readOnly
	 */
	public Boolean enable;

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
}
