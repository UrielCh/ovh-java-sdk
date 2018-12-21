package net.minidev.ovh.api.xdsl;

import java.util.Date;
import net.minidev.ovh.api.complextype.OvhUnitAndValue;
import net.minidev.ovh.api.email.pro.OvhObjectStateEnum;

/**
 * XDSL Email Pro
 */
public class OvhXdslEmailPro {
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
	public String initial;

	/**
	 * Time of account's password last update
	 *
	 * canBeNull && readOnly
	 */
	public Date passwordLastUpdate;

	/**
	 * Account display name
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * Mailbox usage
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> currentUsage;

	/**
	 * Account login
	 *
	 * canBeNull && readOnly
	 */
	public String login;

	/**
	 * Pending tasks for this account
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;

	/**
	 * Default email for this mailbox
	 *
	 * canBeNull && readOnly
	 */
	public String primaryEmailAddress;

	/**
	 * Account first name
	 *
	 * canBeNull && readOnly
	 */
	public String firstName;

	/**
	 * Email domain
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * Account maximum size
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> quota;

	/**
	 * Last logoff
	 *
	 * canBeNull && readOnly
	 */
	public Date lastLogoffDate;

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
}
