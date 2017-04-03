package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Get aliases on this mailingList
 */
public class OvhExchangeMailingListAlias {
	/**
	 * Alias
	 *
	 * canBeNull && readOnly
	 */
	public String alias;

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
