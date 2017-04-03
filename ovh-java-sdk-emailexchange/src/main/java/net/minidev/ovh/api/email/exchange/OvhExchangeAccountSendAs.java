package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Users authorized to send mails from this mailbox
 */
public class OvhExchangeAccountSendAs {
	/**
	 * Account id to give send as
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
