package net.minidev.ovh.api.hosting.privatedatabase.database;

import net.minidev.ovh.api.hosting.privatedatabase.grant.OvhGrantEnum;

/**
 * User granted to a database
 */
public class OvhUser {
	/**
	 * The grantId associated for this databaseName and this userName
	 *
	 * canBeNull
	 */
	public Long grantId;

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
	public OvhGrantEnum grantType;
}
