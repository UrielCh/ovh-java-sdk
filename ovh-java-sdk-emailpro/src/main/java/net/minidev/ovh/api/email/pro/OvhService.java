package net.minidev.ovh.api.email.pro;

import java.util.Date;

/**
 * Email pro service
 */
public class OvhService {
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
	 * Update date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdateDate;

	/**
	 * service displayName
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * Spam and Antivirus configuration
	 *
	 * canBeNull && readOnly
	 */
	public OvhSpamAndVirusConfiguration spamAndVirusConfiguration;

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
	 * enable policy for strong and secure passwords
	 *
	 * canBeNull && readOnly
	 */
	public Boolean complexityEnabled;

	/**
	 * Type of your offer
	 *
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
	 * Hostname of your service
	 *
	 * canBeNull && readOnly
	 */
	public String hostname;

	/**
	 * number of attempts before account to be locked
	 *
	 * canBeNull && readOnly
	 */
	public Long lockoutThreshold;

	/**
	 * number of minutes account will remain locked if it occurs
	 *
	 * canBeNull && readOnly
	 */
	public Long lockoutDuration;

	/**
	 * URL for web interface
	 *
	 * canBeNull && readOnly
	 */
	public String webUrl;

	/**
	 * minimum number of characters password must contain
	 *
	 * canBeNull && readOnly
	 */
	public Long minPasswordLength;

	/**
	 * Domain name of your service
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * State of your service
	 *
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
