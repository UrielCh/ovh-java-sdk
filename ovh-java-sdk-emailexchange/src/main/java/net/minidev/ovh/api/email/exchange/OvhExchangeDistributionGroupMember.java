package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Mailing list members
 */
public class OvhExchangeDistributionGroupMember {
	/**
	 * Member account id
	 *
	 * canBeNull && readOnly
	 */
	public Long memberContactId;

	/**
	 * Member account primaryEmailAddress
	 *
	 * canBeNull && readOnly
	 */
	public String memberEmailAddress;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Member account id
	 *
	 * canBeNull && readOnly
	 */
	public Long memberAccountId;

	/**
	 * Pending task id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;
}
