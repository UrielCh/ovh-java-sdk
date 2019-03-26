package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Mailing list managers
 */
public class OvhExchangeDistributionGroupManager {
	/**
	 * Member account primaryEmailAddress
	 *
	 * canBeNull && readOnly
	 */
	public String managerEmailAddress;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Manager account id
	 *
	 * canBeNull && readOnly
	 */
	public Long managerAccountId;

	/**
	 * Pending task id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;
}
