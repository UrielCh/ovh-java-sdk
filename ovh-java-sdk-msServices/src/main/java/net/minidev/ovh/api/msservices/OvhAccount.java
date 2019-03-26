package net.minidev.ovh.api.msservices;

import java.util.Date;

/**
 * Active Directory Account
 */
public class OvhAccount {
	/**
	 * Account last name
	 *
	 * canBeNull && readOnly
	 */
	public String lastName;

	/**
	 * Account initials
	 *
	 * canBeNull && readOnly
	 */
	public String initials;

	/**
	 * Last update
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdateDate;

	/**
	 * Account display name
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * Time of account's password last update
	 *
	 * canBeNull && readOnly
	 */
	public Date passwordLastUpdate;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Pending task for this account
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;

	/**
	 * Account first name
	 *
	 * canBeNull && readOnly
	 */
	public String firstName;

	/**
	 * Last logoff
	 *
	 * canBeNull && readOnly
	 */
	public Date lastLogoffDate;

	/**
	 * GUID for user in active directory
	 *
	 * canBeNull && readOnly
	 */
	public String guid;

	/**
	 * SAM account name
	 *
	 * canBeNull && readOnly
	 */
	public String SAMAccountName;

	/**
	 * Account state
	 *
	 * canBeNull && readOnly
	 */
	public OvhObjectStateEnum state;

	/**
	 * Account id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Last logon
	 *
	 * canBeNull && readOnly
	 */
	public Date lastLogonDate;

	/**
	 * User Principal Name
	 *
	 * canBeNull && readOnly
	 */
	public String userPrincipalName;
}
