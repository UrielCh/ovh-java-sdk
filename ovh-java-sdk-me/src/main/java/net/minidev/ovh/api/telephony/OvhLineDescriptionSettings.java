package net.minidev.ovh.api.telephony;

/**
 * Line description policies settings
 */
public class OvhLineDescriptionSettings {
	/**
	 * Line's description is displayed on bills
	 *
	 * canBeNull
	 */
	public Boolean displayOnBill;

	/**
	 * Line's description is displayed on incoming calls
	 *
	 * canBeNull
	 */
	public Boolean displayOnIncomingCall;
}
