package net.minidev.ovh.api.xdsl;

import net.minidev.ovh.api.xdsl.monitoringnotifications.OvhFrequencyEnum;
import net.minidev.ovh.api.xdsl.monitoringnotifications.OvhTypeEnum;

/**
 * Defines where and how the notifications will be sent
 */
public class OvhMonitoringNotification {
	/**
	 * The SMS account which will be debited for each sent SMS, if the type is sms
	 *
	 * canBeNull && readOnly
	 */
	public String smsAccount;

	/**
	 * The phone number, if type is sms
	 *
	 * canBeNull && readOnly
	 */
	public String phone;

	/**
	 * Whether or not to allow notifications for generic incidents
	 *
	 * canBeNull && readOnly
	 */
	public Boolean allowIncident;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTypeEnum type;

	/**
	 * The e-mail address, if type is mail
	 *
	 * canBeNull && readOnly
	 */
	public String email;

	/**
	 * canBeNull && readOnly
	 */
	public Boolean enabled;

	/**
	 * The number of seconds the access has to be down to trigger an alert
	 *
	 * canBeNull && readOnly
	 */
	public Long downThreshold;

	/**
	 * The frenquency to send reminders when the access is still down
	 *
	 * canBeNull && readOnly
	 */
	public OvhFrequencyEnum frequency;
}
