package net.minidev.ovh.api.paas.database.instance.database;

import net.minidev.ovh.api.paas.database.instance.grant.OvhType;

/**
 * User granted to a database
 */
public class OvhUser {
	/**
	 * The grantId associated for this databaseName and this userName
	 *
	 * canBeNull
	 */
	public String grantId;

	/**
	 * User's name granted on this database
	 *
	 * canBeNull
	 */
	public String userName;

	/**
	 * User's rights on this database
	 *
	 * canBeNull
	 */
	public OvhType grantType;
}
