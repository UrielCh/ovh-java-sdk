package net.minidev.ovh.api.email.domain;

/**
 * Check Migration result
 */
public class OvhMigrationCheckStruct {
	/**
	 * List of filters
	 *
	 * canBeNull
	 */
	public String[] filter;

	/**
	 * List of forwards
	 *
	 * canBeNull
	 */
	public String[] forward;

	/**
	 * List of warnings
	 *
	 * canBeNull
	 */
	public OvhMigrationCheckResultStruct[] warning;

	/**
	 * List of aliases
	 *
	 * canBeNull
	 */
	public String[] alias;

	/**
	 * List of errors
	 *
	 * canBeNull
	 */
	public OvhMigrationCheckResultStruct[] error;
}
