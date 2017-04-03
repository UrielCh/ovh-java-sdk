package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Get users authorized to Send On Behalf To mails from this mailbox
 */
public class OvhExchangeAccountSendOnBehalfTo {
	/**
	 * Account id to give send on behalf to
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
