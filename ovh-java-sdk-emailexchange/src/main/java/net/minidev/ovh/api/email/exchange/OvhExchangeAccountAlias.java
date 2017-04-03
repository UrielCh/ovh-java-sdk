package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Aliases on this mailbox
 */
public class OvhExchangeAccountAlias {
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
