package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Exchange shared mailbox
 */
public class OvhSharedAccount {
	/**
	 * Shared account last name
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
	 * Ticket number of spam detection
	 *
	 * canBeNull && readOnly
	 */
	public Long spamTicketNumber;

	/**
	 * Shared account display name
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * Shared account initials
	 *
	 * canBeNull && readOnly
	 */
	public String initials;

	/**
	 * Enable or disable anti-virus and anti-spam
	 *
	 * canBeNull && readOnly
	 */
	public OvhMailingFilterEnum[] mailingFilter;

	/**
	 * Shared mailbox usage
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
	 * Pending tasks for this shared account
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;

	/**
	 * Shared account first name
	 *
	 * canBeNull && readOnly
	 */
	public String firstName;

	/**
	 * Hide shared account in Global Address List
	 *
	 * canBeNull && readOnly
	 */
	public Boolean hiddenFromGAL;

	/**
	 * Shared account maximum size
	 *
	 * canBeNull && readOnly
	 */
	public Long quota;

	/**
	 * Default email for this shared mailbox
	 *
	 * canBeNull && readOnly
	 */
	public String sharedEmailAddress;

	/**
	 * Last logoff
	 *
	 * canBeNull && readOnly
	 */
	public Date lastLogoffDate;

	/**
	 * Shared account state
	 *
	 * canBeNull && readOnly
	 */
	public OvhObjectStateEnum state;

	/**
	 * Shared account id
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
