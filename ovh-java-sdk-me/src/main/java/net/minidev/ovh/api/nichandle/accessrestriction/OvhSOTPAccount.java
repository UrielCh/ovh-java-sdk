package net.minidev.ovh.api.nichandle.accessrestriction;

import java.util.Date;

/**
 * SOTP Two-Factor Authentication
 */
public class OvhSOTPAccount {
	/**
	 * Last used date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUsedDate;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Number of remaining codes
	 *
	 * canBeNull && readOnly
	 */
	public Long remaining;

	/**
	 * Status of this account
	 *
	 * canBeNull && readOnly
	 */
	public OvhSOTPStatusEnum status;
}
