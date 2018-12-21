package net.minidev.ovh.api.sms;

/**
 * SMS users
 */
public class OvhUser {
	/**
	 * canBeNull && readOnly
	 */
	public String password;

	/**
	 * URL called when state of a sent SMS changes
	 *
	 * canBeNull && readOnly
	 */
	public String callBack;

	/**
	 * URL called when a STOP is received after a receiver replied stop to a SMS
	 *
	 * canBeNull && readOnly
	 */
	public String stopCallBack;

	/**
	 * canBeNull && readOnly
	 */
	public String[] ipRestrictions;

	/**
	 * The sms user login
	 *
	 * canBeNull && readOnly
	 */
	public String login;

	/**
	 * canBeNull && readOnly
	 */
	public OvhAlertThreshold alertThresholdInformations;

	/**
	 * canBeNull && readOnly
	 */
	public OvhQuota quotaInformations;
}
