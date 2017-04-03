package net.minidev.ovh.api.paas.database.instance.user;

import net.minidev.ovh.api.paas.database.instance.grant.OvhType;

/**
 * Databases linked to an user
 */
public class OvhDatabase {
	/**
	 * The grantId associated to this userName for this databaseName
	 *
	 * canBeNull
	 */
	public String grantId;

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
	public OvhType grantType;
}
