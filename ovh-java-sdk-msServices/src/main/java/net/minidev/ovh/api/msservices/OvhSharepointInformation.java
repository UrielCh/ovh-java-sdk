package net.minidev.ovh.api.msservices;

/**
 * Sharepoint account information
 */
public class OvhSharepointInformation {
	/**
	 * Indicates if the account is configured
	 *
	 * canBeNull && readOnly
	 */
	public Boolean configured;

	/**
	 * Sharepoint account license
	 *
	 * canBeNull && readOnly
	 */
	public OvhSharepointLicenseEnum license;

	/**
	 * delete at expiration
	 *
	 * canBeNull && readOnly
	 */
	public Boolean deleteAtExpiration;

	/**
	 * Active Directory Account id
	 *
	 * canBeNull && readOnly
	 */
	public Long activeDirectoryAccountId;

	/**
	 * OneDrive maximum size in byte
	 *
	 * canBeNull && readOnly
	 */
	public Long quota;

	/**
	 * OneDrive usage in byte
	 *
	 * canBeNull && readOnly
	 */
	public Long currentUsage;

	/**
	 * office license is available
	 *
	 * canBeNull && readOnly
	 */
	public Boolean officeLicense;

	/**
	 * Sharepoint account state
	 *
	 * canBeNull && readOnly
	 */
	public OvhObjectStateEnum state;

	/**
	 * Sharepoint account id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * The rights assigned to the sharepoint account
	 *
	 * canBeNull && readOnly
	 */
	public OvhSharepointAccountAccessRightsEnum accessRights;

	/**
	 * Pending task for this sharepoint account
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;
}
