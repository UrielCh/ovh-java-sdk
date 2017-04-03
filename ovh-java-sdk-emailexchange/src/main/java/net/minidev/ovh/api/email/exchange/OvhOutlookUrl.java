package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Outlook url
 */
public class OvhOutlookUrl {
	/**
	 * Serial number
	 *
	 * canBeNull && readOnly
	 */
	public String serial;

	/**
	 * Url expiration date
	 *
	 * canBeNull && readOnly
	 */
	public Date expiration;

	/**
	 * Outlook url
	 *
	 * canBeNull && readOnly
	 */
	public String url;
}
