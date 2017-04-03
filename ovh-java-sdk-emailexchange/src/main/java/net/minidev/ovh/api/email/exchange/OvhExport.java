package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Export PST file request
 */
public class OvhExport {
	/**
	 * Percentage of export PST request completion
	 *
	 * canBeNull && readOnly
	 */
	public Long percentComplete;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Task pending id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;
}
