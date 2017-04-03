package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Resource accounts delegates
 */
public class OvhExchangeResourceAccountDelegate {
	/**
	 * delegate's account id
	 *
	 * canBeNull && readOnly
	 */
	public Long allowedAccountId;

	/**
	 * Delegate account primaryEmailAddress
	 *
	 * canBeNull && readOnly
	 */
	public String delegateEmailAddress;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * task pending id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;
}
