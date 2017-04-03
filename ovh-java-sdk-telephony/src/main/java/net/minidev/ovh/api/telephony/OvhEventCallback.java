package net.minidev.ovh.api.telephony;

/**
 * Callback url for each event
 */
public class OvhEventCallback {
	/**
	 * Email notification address in case of url calling failure
	 *
	 * canBeNull && readOnly
	 */
	public String emailError;

	/**
	 * Url called for each event
	 *
	 * canBeNull && readOnly
	 */
	public String url;
}
