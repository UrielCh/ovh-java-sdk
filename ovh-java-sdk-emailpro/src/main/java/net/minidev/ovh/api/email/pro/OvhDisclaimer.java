package net.minidev.ovh.api.email.pro;

import java.util.Date;

/**
 * disclaimer
 */
public class OvhDisclaimer {
	/**
	 * Disclaimer name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Activate the disclaimer only for external emails
	 *
	 * canBeNull && readOnly
	 */
	public Boolean outsideOnly;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Signature, added at the bottom of your organization emails
	 *
	 * canBeNull && readOnly
	 */
	public String content;

	/**
	 * task pending id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;
}
