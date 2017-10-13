package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Exchange Account Archive
 */
public class OvhExchangeAccountArchive {
	/**
	 * Archive mailbox maximum size in GB
	 *
	 * canBeNull && readOnly
	 */
	public Long quota;

	/**
	 * Archive mailbox usage
	 *
	 * canBeNull && readOnly
	 */
	public Long currentUsage;

	/**
	 * GUID of archive mailbox
	 *
	 * canBeNull && readOnly
	 */
	public String guid;

	/**
	 * Archive mailbox state
	 *
	 * canBeNull && readOnly
	 */
	public OvhObjectStateEnum state;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Pending task for this archive mailbox
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;
}
