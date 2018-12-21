package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Protocol access policy for this Exchange service
 */
public class OvhExchangeServiceProtocol {
	/**
	 * POP protocol enabled on this Exchange service
	 *
	 * canBeNull && readOnly
	 */
	public Boolean POP;

	/**
	 * IMAP protocol enabled on this Exchange service
	 *
	 * canBeNull && readOnly
	 */
	public Boolean IMAP;

	/**
	 * Web mail protocol enabled on this Exchange service
	 *
	 * canBeNull && readOnly
	 */
	public Boolean webMail;

	/**
	 * ActiveSync protocol enabled on this Exchange service
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

	/**
	 * ActiveSync policy to apply at device's first connection
	 *
	 * canBeNull && readOnly
	 */
	public OvhActiveSyncPolicyEnum activeSyncPolicy;
}
