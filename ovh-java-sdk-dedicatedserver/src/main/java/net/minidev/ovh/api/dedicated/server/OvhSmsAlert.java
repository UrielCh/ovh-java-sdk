package net.minidev.ovh.api.dedicated.server;

/**
 * Monitoring SMS alert details, This service is currently not supported for servers at BHS 
 */
public class OvhSmsAlert {
	/**
	 * Your SMS account
	 *
	 * canBeNull && readOnly
	 */
	public String smsAccount;

	/**
	 * Daily hour end time for SMS notification
	 *
	 * canBeNull && readOnly
	 */
	public Long fromHour;

	/**
	 * Alert language
	 *
	 * canBeNull && readOnly
	 */
	public OvhAlertLanguageEnum language;

	/**
	 * Id of this alert
	 *
	 * canBeNull && readOnly
	 */
	public Long alertId;

	/**
	 * Alert destination
	 *
	 * canBeNull && readOnly
	 */
	public String phoneNumberTo;

	/**
	 * Is this alert enabled
	 *
	 * canBeNull && readOnly
	 */
	public Boolean enabled;

	/**
	 * Daily hour start time for SMS notification
	 *
	 * canBeNull && readOnly
	 */
	public Long toHour;
}
