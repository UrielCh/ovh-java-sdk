package net.minidev.ovh.api.hosting.web;

import net.minidev.ovh.api.hosting.web.mail.OvhStateEnum;

/**
 * Hosting automated emails
 */
public class OvhEmail {
	/**
	 * Bounce
	 *
	 * canBeNull && readOnly
	 */
	public Long bounce;

	/**
	 * Max email to sent per day
	 *
	 * canBeNull && readOnly
	 */
	public Long maxPerDay;

	/**
	 * Email state
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * Email sent since hosting creation
	 *
	 * canBeNull && readOnly
	 */
	public Long sent;

	/**
	 * Email used to receive errors
	 *
	 * canBeNull && readOnly
	 */
	public String email;

	/**
	 * Email sent today
	 *
	 * canBeNull && readOnly
	 */
	public Long sentToday;
}
