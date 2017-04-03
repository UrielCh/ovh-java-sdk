package net.minidev.ovh.api.email.exchange;

/**
 * Get public folder quota usage in total available space
 */
public class OvhPublicFolderQuota {
	/**
	 * currently used space in MB within all public folders
	 *
	 * canBeNull
	 */
	public Long quotaUsed;

	/**
	 * space in MB already reserved from the quota limit
	 *
	 * canBeNull
	 */
	public Long quotaReserved;

	/**
	 * total amount of space in MB for public folders within organization
	 *
	 * canBeNull
	 */
	public Long quotaLimit;
}
