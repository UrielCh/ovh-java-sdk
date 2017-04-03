package net.minidev.ovh.api.nichandle.accessrestriction;

/**
 * TOTP Two-Factor Authentication
 */
public class OvhTOTPAccount {
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
	public OvhTOTPStatusEnum status;
}
