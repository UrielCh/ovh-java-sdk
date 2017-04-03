package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Get protocol status on that mailbox
 */
public class OvhExchangeAccountProtocol {
	/**
	 * POP protocol enabled on that mailbox
	 *
	 * canBeNull && readOnly
	 */
	public Boolean POP;

	/**
	 * IMAP protocol enabled on that mailbox
	 *
	 * canBeNull && readOnly
	 */
	public Boolean IMAP;

	/**
	 * Web mail enabled on that mailbox
	 *
	 * canBeNull && readOnly
	 */
	public Boolean webMail;

	/**
	 * Mobile access enabled on that mailbox
	 *
	 * canBeNull && readOnly
	 */
	public Boolean activeSync;

	/**
	 * Last update date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

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
