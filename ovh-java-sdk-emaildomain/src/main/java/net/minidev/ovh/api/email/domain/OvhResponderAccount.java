package net.minidev.ovh.api.email.domain;

import java.util.Date;

/**
 * Responder of account
 */
public class OvhResponderAccount {
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
	 * If true, emails will be copy to emailToCopy address
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
	 * Name of account
	 *
	 * canBeNull && readOnly
	 */
	public String account;

	/**
	 * Content of responder
	 *
	 * canBeNull && readOnly
	 */
	public String content;
}
