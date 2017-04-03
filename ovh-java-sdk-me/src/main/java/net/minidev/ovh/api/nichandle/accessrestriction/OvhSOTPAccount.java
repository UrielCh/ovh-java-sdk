package net.minidev.ovh.api.nichandle.accessrestriction;

/**
 * SOTP Two-Factor Authentication
 */
public class OvhSOTPAccount {
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
