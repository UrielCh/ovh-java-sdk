package net.minidev.ovh.api.email.mxplan;

import java.util.Date;

/**
 * Aliases on this mailbox
 */
public class OvhAccountAlias {
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
