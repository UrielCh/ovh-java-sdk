package net.minidev.ovh.api.msservices;

import java.util.Date;

/**
 * Exchange mailbox information
 */
public class OvhExchangeInformation {
	/**
	 * Indicates if the account is configured
	 *
	 * canBeNull && readOnly
	 */
	public Boolean configured;

	/**
	 * Frequency of Outlook license renewals
	 *
	 * canBeNull && readOnly
	 */
	public OvhRenewPeriodEnum renewOutlookPeriod;

	/**
	 * Delete mailbox at expiration date
	 *
	 * canBeNull && readOnly
	 */
	public Boolean deleteAtExpiration;

	/**
	 * Expiration date of Outlook license
	 *
	 * canBeNull && readOnly
	 */
	public Date expirationOutlookDate;

	/**
	 * Spam activity detected on this mailbox
	 *
	 * canBeNull && readOnly
	 */
	public Boolean spamDetected;

	/**
	 * Outlook licence attached
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
	 * Enable or disable anti-virus and anti-spam
	 *
	 * canBeNull && readOnly
	 */
	public OvhMailingFilterEnum[] mailingFilter;

	/**
	 * Mailbox usage in KB
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
	 * Spam and Antivirus configuration
	 *
	 * canBeNull && readOnly
	 */
	public OvhSpamAndVirusConfiguration spamAndVirusConfiguration;

	/**
	 * Delete Outlook license at expiration date
	 *
	 * canBeNull && readOnly
	 */
	public Boolean deleteOutlookAtExpiration;

	/**
	 * Primary address of the mailbox
	 *
	 * canBeNull && readOnly
	 */
	public String primaryEmailAddress;

	/**
	 * Pending task id for this account
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;

	/**
	 * Exchange account license
	 *
	 * canBeNull && readOnly
	 */
	public OvhExchangeLicenceEnum accountLicense;

	/**
	 * OWA policy restriction is applied
	 *
	 * canBeNull && readOnly
	 */
	public Boolean owaLimited;

	/**
	 * Frequency of mailbox license renewals
	 *
	 * canBeNull && readOnly
	 */
	public OvhRenewPeriodEnum renewPeriod;

	/**
	 * Visibility in Global Address List
	 *
	 * canBeNull && readOnly
	 */
	public Boolean hiddenFromGAL;

	/**
	 * Maximum mailbox usage in GB (overall size)
	 *
	 * canBeNull && readOnly
	 */
	public Long quota;

	/**
	 * Mailbox state
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
	 * Property needed for mailbox manual configuration (GUID)
	 *
	 * canBeNull && readOnly
	 */
	public String exchangeGuid;

	/**
	 * Expiration date
	 *
	 * canBeNull && readOnly
	 */
	public Date expirationDate;
}
