package net.minidev.ovh.api.nichandle.accessrestriction;

/**
 * U2F Two-Factor Authentication
 */
public class OvhU2FAccount {
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
	public OvhU2FStatusEnum status;
}
