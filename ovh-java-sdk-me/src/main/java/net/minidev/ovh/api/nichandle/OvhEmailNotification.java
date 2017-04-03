package net.minidev.ovh.api.nichandle;

import java.util.Date;

/**
 * Email notification
 */
public class OvhEmailNotification {
	/**
	 * This email date
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * This email subject
	 *
	 * canBeNull && readOnly
	 */
	public String subject;

	/**
	 * This email Id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * This email body
	 *
	 * canBeNull && readOnly
	 */
	public String body;
}
