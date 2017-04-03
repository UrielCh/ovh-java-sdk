package net.minidev.ovh.api.nichandle.accessrestriction;

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
	 * The Id of the restriction
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Status of this account
	 *
	 * canBeNull && readOnly
	 */
	public OvhSmsStatusEnum status;
}
