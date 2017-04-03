package net.minidev.ovh.api.email.exchange;

/**
 * Get shared account quota usage in total available space
 */
public class OvhSharedAccountQuota {
	/**
	 * currently used space in KB within all shared accounts
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
	 * total amount of space in MB for shared accounts within organization
	 *
	 * canBeNull
	 */
	public Long quotaLimit;
}
