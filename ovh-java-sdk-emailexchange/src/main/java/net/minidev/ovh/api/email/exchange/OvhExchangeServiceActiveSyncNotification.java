package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Get email addresses subscribed to ActiveSync quarantine notifications
 */
public class OvhExchangeServiceActiveSyncNotification {
	/**
	 * Notified Account Id
	 *
	 * canBeNull && readOnly
	 */
	public Long notifiedAccountId;

	/**
	 * Email state
	 *
	 * canBeNull && readOnly
	 */
	public OvhActiveSyncNotificationStateEnum state;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Primary email address for notified account
	 *
	 * canBeNull && readOnly
	 */
	public String primaryEmailAddress;
}
