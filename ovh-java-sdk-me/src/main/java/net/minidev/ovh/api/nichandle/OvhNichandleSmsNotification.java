package net.minidev.ovh.api.nichandle;

import java.util.Date;

/**
 * SMS notifications
 */
public class OvhNichandleSmsNotification {
	/**
	 * Last update date
	 *
	 * canBeNull && readOnly
	 */
	public Date updateDate;

	/**
	 * The phone number you want to receive notification on
	 *
	 * canBeNull && readOnly
	 */
	public String phoneNumber;

	/**
	 * Receive notification for abuse reports
	 *
	 * canBeNull && readOnly
	 */
	public Boolean abuse;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Status of your notification
	 *
	 * canBeNull && readOnly
	 */
	public OvhNotificationStatusEnum status;
}
