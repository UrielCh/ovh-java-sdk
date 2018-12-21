package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Exchange service
 */
public class OvhExchangeService {
	/**
	 * Maximum message size that You can receive in MB
	 *
	 * canBeNull && readOnly
	 */
	public Long maxReceiveSize;

	/**
	 * minimum number of days before able to change account's password
	 *
	 * canBeNull && readOnly
	 */
	public Long minPasswordAge;

	/**
	 * service displayName
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * Update date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdateDate;

	/**
	 * canBeNull && readOnly
	 */
	public Date sslExpirationDate;

	/**
	 * enable policy for strong and secure passwords
	 *
	 * canBeNull && readOnly
	 */
	public Boolean complexityEnabled;

	/**
	 * Task pending id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;

	/**
	 * maximum number of days that account's password is valid before expiration
	 *
	 * canBeNull && readOnly
	 */
	public Long maxPasswordAge;

	/**
	 * Spam and Antivirus configuration
	 *
	 * canBeNull && readOnly
	 */
	public OvhSpamAndVirusConfiguration spamAndVirusConfiguration;

	/**
	 * canBeNull && readOnly
	 */
	public OvhServiceOfferEnum offer;

	/**
	 * Maximum message size that You can send in MB
	 *
	 * canBeNull && readOnly
	 */
	public Long maxSendSize;

	/**
	 * canBeNull && readOnly
	 */
	public String hostname;

	/**
	 * number of historical password that cannot be reused
	 *
	 * canBeNull && readOnly
	 */
	public Long passwordHistoryCount;

	/**
	 * number of minutes account will remain locked if it occurs
	 *
	 * canBeNull && readOnly
	 */
	public Long lockoutDuration;

	/**
	 * number of attempts before account to be locked
	 *
	 * canBeNull && readOnly
	 */
	public Long lockoutThreshold;

	/**
	 * minimum number of characters password must contain
	 *
	 * canBeNull && readOnly
	 */
	public Long minPasswordLength;

	/**
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * canBeNull && readOnly
	 */
	public OvhServiceStateEnum state;

	/**
	 * number of minutes that must elapse after a failed logon to reset lockout trigger
	 *
	 * canBeNull && readOnly
	 */
	public Long lockoutObservationWindow;
}
