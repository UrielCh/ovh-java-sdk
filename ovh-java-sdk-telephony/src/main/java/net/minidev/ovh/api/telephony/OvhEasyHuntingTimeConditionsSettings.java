package net.minidev.ovh.api.telephony;

/**
 * Easy hunting time conditions options
 */
public class OvhEasyHuntingTimeConditionsSettings {
	/**
	 * canBeNull && readOnly
	 */
	public OvhTimeConditionsSettingsForwardTypeEnum slot1Type;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTimeConditionsSettingsForwardTypeEnum unavailableType;

	/**
	 * canBeNull && readOnly
	 */
	public Boolean enable;

	/**
	 * canBeNull && readOnly
	 */
	public String slot1Number;

	/**
	 * canBeNull && readOnly
	 */
	public String unavailableNumber;
}
