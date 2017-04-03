package net.minidev.ovh.api.email.domain;

import java.util.Date;

/**
 * Task filter List
 */
public class OvhTaskFilter {
	/**
	 * Domain name of task
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * Action of task
	 *
	 * canBeNull && readOnly
	 */
	public String action;

	/**
	 * Id of task
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Account name of task
	 *
	 * canBeNull && readOnly
	 */
	public String account;

	/**
	 * Creation date of task
	 *
	 * canBeNull && readOnly
	 */
	public Date timestamp;
}
