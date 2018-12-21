package net.minidev.ovh.api.email.domain;

import java.util.Date;

/**
 * Responder
 */
public class OvhResponder {
	/**
	 * Account where copy emails
	 *
	 * canBeNull && readOnly
	 */
	public String copyTo;

	/**
	 * Date of start responder
	 *
	 * canBeNull && readOnly
	 */
	public Date from;

	/**
	 * If false, emails will be dropped. If true and copyTo field is empty, emails will be delivered to your mailbox. If true and copyTo is set with an address, emails will be delivered to this address
	 *
	 * canBeNull && readOnly
	 */
	public Boolean copy;

	/**
	 * Date of end responder
	 *
	 * canBeNull && readOnly
	 */
	public Date to;

	/**
	 * Content of responder
	 *
	 * canBeNull && readOnly
	 */
	public String content;

	/**
	 * Name of account
	 *
	 * canBeNull && readOnly
	 */
	public String account;
}
