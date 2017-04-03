package net.minidev.ovh.api.hosting.privatedatabase.user;

import net.minidev.ovh.api.hosting.privatedatabase.grant.OvhGrantEnum;

/**
 * Databases linked to an user
 */
public class OvhDatabase {
	/**
	 * The grantId associated to this userName for this databaseName
	 *
	 * canBeNull
	 */
	public Long grantId;

	/**
	 * Database's name linked to this user
	 *
	 * canBeNull
	 */
	public String databaseName;

	/**
	 * Grant of this user for this database
	 *
	 * canBeNull
	 */
	public OvhGrantEnum grantType;
}
