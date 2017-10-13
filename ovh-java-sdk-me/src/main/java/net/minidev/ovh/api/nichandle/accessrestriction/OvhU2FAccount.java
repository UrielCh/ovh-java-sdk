package net.minidev.ovh.api.nichandle.accessrestriction;

import java.util.Date;

/**
 * U2F Two-Factor Authentication
 */
public class OvhU2FAccount {
	/**
	 * Last used date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUsedDate;

	/**
	 * Description of this U2F key
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * The Id of the restriction
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Status of this account
	 *
	 * canBeNull && readOnly
	 */
	public OvhU2FStatusEnum status;
}
