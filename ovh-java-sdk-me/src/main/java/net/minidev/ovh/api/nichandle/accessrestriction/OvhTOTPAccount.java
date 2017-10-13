package net.minidev.ovh.api.nichandle.accessrestriction;

import java.util.Date;

/**
 * TOTP Two-Factor Authentication
 */
public class OvhTOTPAccount {
	/**
	 * Last used date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUsedDate;

	/**
	 * Description of this TOTP
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
	public OvhTOTPStatusEnum status;
}
