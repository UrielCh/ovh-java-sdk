package net.minidev.ovh.api.msservices;

/**
 * Sync account information
 */
public class OvhSyncInformation {
	/**
	 * Indicates if the account is configured
	 *
	 * canBeNull && readOnly
	 */
	public Boolean configured;

	/**
	 * Sync account license
	 *
	 * canBeNull && readOnly
	 */
	public OvhSyncLicenseEnum license;

	/**
	 * Sync account state
	 *
	 * canBeNull && readOnly
	 */
	public OvhObjectStateEnum state;

	/**
	 * Pending task for this sync account
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;
}
