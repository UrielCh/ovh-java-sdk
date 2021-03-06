package net.minidev.ovh.api.email.mxplan;

import java.util.Date;
import net.minidev.ovh.api.email.pro.OvhMailingFilterEnum;
import net.minidev.ovh.api.email.pro.OvhObjectStateEnum;
import net.minidev.ovh.api.email.pro.OvhRenewPeriodEnum;
import net.minidev.ovh.api.email.pro.OvhSpamAndVirusConfiguration;

/**
 * Mailbox
 */
public class OvhAccount {
	/**
	 * Account last name
	 *
	 * canBeNull && readOnly
	 */
	public String lastName;

	/**
	 * Account was sending spam
	 *
	 * canBeNull && readOnly
	 */
	public Boolean spamDetected;

	/**
	 * Last update
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdateDate;

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
	 * Ticket number of spam detection
	 *
	 * canBeNull && readOnly
	 */
	public Long spamTicketNumber;

	/**
	 * Account login
	 *
	 * canBeNull && readOnly
	 */
	public String login;

	/**
	 * Default email for this mailbox
	 *
	 * canBeNull && readOnly
	 */
	public String primaryEmailAddress;

	/**
	 * Spam and Antivirus configuration
	 *
	 * canBeNull && readOnly
	 */
	public OvhSpamAndVirusConfiguration spamAndVirusConfiguration;

	/**
	 * Hide account in Global Address List
	 *
	 * canBeNull && readOnly
	 */
	public Boolean hiddenFromGAL;

	/**
	 * Account maximum size
	 *
	 * canBeNull && readOnly
	 */
	public Double quota;

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
	 * expiration date
	 *
	 * canBeNull && readOnly
	 */
	public Date expirationDate;

	/**
	 * Indicates if the account is configured
	 *
	 * canBeNull && readOnly
	 */
	public Boolean configured;

	/**
	 * delete at expiration
	 *
	 * canBeNull && readOnly
	 */
	public Boolean deleteAtExpiration;

	/**
	 * expiration date
	 *
	 * canBeNull && readOnly
	 */
	public Date expirationOutlookDate;

	/**
	 * Account initials
	 *
	 * canBeNull && readOnly
	 */
	public String initial;

	/**
	 * Enable or disable anti-virus and anti-spam
	 *
	 * canBeNull && readOnly
	 */
	public OvhMailingFilterEnum[] mailingFilter;

	/**
	 * Mailbox usage
	 *
	 * canBeNull && readOnly
	 */
	public Long currentUsage;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Pending tasks for this account
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
	 * change the renew period
	 *
	 * canBeNull && readOnly
	 */
	public OvhRenewPeriodEnum renewPeriod;

	/**
	 * Email domain
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * Last logoff
	 *
	 * canBeNull && readOnly
	 */
	public Date lastLogoffDate;

	/**
	 * SAM account name
	 *
	 * canBeNull && readOnly
	 */
	public String SAMAccountName;

	/**
	 * Last logon
	 *
	 * canBeNull && readOnly
	 */
	public Date lastLogonDate;
}
