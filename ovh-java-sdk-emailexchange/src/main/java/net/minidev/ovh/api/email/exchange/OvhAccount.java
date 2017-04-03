package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Exchange mailbox
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
	 * Outlook licence
	 *
	 * canBeNull && readOnly
	 */
	public Boolean outlookLicense;

	/**
	 * Ticket number of spam detection
	 *
	 * canBeNull && readOnly
	 */
	public Long spamTicketNumber;

	/**
	 * Time of account's password last update
	 *
	 * canBeNull && readOnly
	 */
	public Date passwordLastUpdate;

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
	public Long quota;

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
	 * change the renew period for outlook
	 *
	 * canBeNull && readOnly
	 */
	public OvhRenewPeriodEnum renewOutlookPeriod;

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
	 * delete outlook at expiration
	 *
	 * canBeNull && readOnly
	 */
	public Boolean deleteOutlookAtExpiration;

	/**
	 * Pending tasks for this account
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;

	/**
	 * Exchange account type
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhLicenceEnum accountLicense;

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
	 * Last logon
	 *
	 * canBeNull && readOnly
	 */
	public Date lastLogonDate;

	/**
	 * exchangeGuid for manual configuration
	 *
	 * canBeNull && readOnly
	 */
	public String exchangeGuid;
}
