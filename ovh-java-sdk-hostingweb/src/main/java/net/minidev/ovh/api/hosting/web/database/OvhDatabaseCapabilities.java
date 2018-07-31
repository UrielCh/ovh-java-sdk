package net.minidev.ovh.api.hosting.web.database;

/**
 * Struct which describe available features for a database
 */
public class OvhDatabaseCapabilities {
	/**
	 * URL of the database management tool
	 *
	 * canBeNull
	 */
	public String guiURL;

	/**
	 * Availability of the getQuota function
	 *
	 * canBeNull
	 */
	public Boolean getRight;

	/**
	 * Availability of the restore function
	 *
	 * canBeNull
	 */
	public Boolean restore;

	/**
	 * Availability of the optimize function
	 *
	 * canBeNull
	 */
	public Boolean optimize;

	/**
	 * Availability of the changeRight function
	 *
	 * canBeNull
	 */
	public Boolean changeRight;

	/**
	 * Availability of the dump function
	 *
	 * canBeNull
	 */
	public Boolean dump;

	/**
	 * Availability of the delete function
	 *
	 * canBeNull
	 */
	public Boolean delete;

	/**
	 * Availability of the getQuota function
	 *
	 * canBeNull
	 */
	public Boolean getQuota;

	/**
	 * Availability of the changePassword function
	 *
	 * canBeNull
	 */
	public Boolean changePassword;
}
