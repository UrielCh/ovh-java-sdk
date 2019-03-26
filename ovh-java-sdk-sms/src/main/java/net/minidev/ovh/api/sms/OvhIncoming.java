package net.minidev.ovh.api.sms;

import java.util.Date;

/**
 * Sms history of sms incoming received
 */
public class OvhIncoming {
	/**
	 * canBeNull && readOnly
	 */
	public Double credits;

	/**
	 * canBeNull && readOnly
	 */
	public String sender;

	/**
	 * canBeNull && readOnly
	 */
	public String tag;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public String message;

	/**
	 * canBeNull && readOnly
	 */
	public Date creationDatetime;
}
