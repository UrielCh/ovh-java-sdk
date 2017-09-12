package net.minidev.ovh.api.email.domain;

/**
 * Check Migration result
 */
public class OvhMigrationCheckResultStruct {
	/**
	 * Result code of check migration
	 *
	 * canBeNull
	 */
	public OvhMigrationCheckCodeEnum code;

	/**
	 * Details of result code
	 *
	 * canBeNull
	 */
	public String details;
}
