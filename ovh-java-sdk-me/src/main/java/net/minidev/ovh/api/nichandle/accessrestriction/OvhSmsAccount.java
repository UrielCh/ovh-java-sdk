package net.minidev.ovh.api.nichandle.accessrestriction;

import java.util.Date;

/**
 * Sms Two-Factor Authentication
 */
public class OvhSmsAccount {
	/**
	 * Associated phone number
	 *
	 * canBeNull && readOnly
	 */
	public String phoneNumber;

	/**
	 * Last used date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUsedDate;

	/**
	 * Description of this phone
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
	public OvhSmsStatusEnum status;
}
