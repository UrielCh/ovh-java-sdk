package net.minidev.ovh.api.hosting.privatedatabase;

import java.util.Date;
import net.minidev.ovh.api.hosting.privatedatabase.grant.OvhGrantEnum;

/**
 * Grants
 */
public class OvhGrant {
	/**
	 * Database name where grant is set
	 *
	 * canBeNull && readOnly
	 */
	public String databaseName;

	/**
	 * Grant set
	 *
	 * canBeNull && readOnly
	 */
	public OvhGrantEnum grant;

	/**
	 * Creation date of the grant
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;
}
