package net.minidev.ovh.api.license.office;

/**
 * Office user
 */
public class OvhOfficeUser {
	/**
	 * User's first name
	 *
	 * canBeNull && readOnly
	 */
	public String firstName;

	/**
	 * User's last name
	 *
	 * canBeNull && readOnly
	 */
	public String lastName;

	/**
	 * Whether or not this user slot will be resigned at the next renew period
	 *
	 * canBeNull && readOnly
	 */
	public Boolean deleteAtExpiration;

	/**
	 * Specify if the user is actually a user slot (configureme) or a real user
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isVirtual;

	/**
	 * Licenses attributed to the user
	 *
	 * canBeNull && readOnly
	 */
	public OvhLicenceEnum[] licences;

	/**
	 * Email used to activate Microsoft Office
	 *
	 * canBeNull && readOnly
	 */
	public String activationEmail;

	/**
	 * Pending task id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;

	/**
	 * User state
	 *
	 * canBeNull && readOnly
	 */
	public OvhUserStateEnum status;
}
