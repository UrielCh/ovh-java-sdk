package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Users having full access on this shared mailbox
 */
public class OvhExchangeSharedAccountFullAccess {
	/**
	 * Account id to give full access
	 *
	 * canBeNull && readOnly
	 */
	public Long allowedAccountId;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Pending task id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;
}
