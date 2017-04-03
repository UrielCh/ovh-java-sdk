package net.minidev.ovh.api.telephony;

/**
 * Relevant informations of the phone reset
 */
public class OvhResetPhoneInfo {
	/**
	 * Which way had been used to reset the phone
	 *
	 * canBeNull
	 */
	public OvhResetPhoneMethodEnum resetPhoneMethod;

	/**
	 * Reset code informations
	 *
	 * canBeNull
	 */
	public OvhResetPhoneCodeInfo resetCodeInfo;
}
