package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Users authorized to send mails from this shared mailbox
 */
public class OvhExchangeSharedAccountSendAs {
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
