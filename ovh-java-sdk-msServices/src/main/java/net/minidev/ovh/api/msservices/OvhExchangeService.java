package net.minidev.ovh.api.msservices;

import java.util.Date;

/**
 * Exchange service
 */
public class OvhExchangeService {
	/**
	 * Exchange service offer
	 *
	 * canBeNull && readOnly
	 */
	public OvhServiceOfferEnum offer;

	/**
	 * Maximum allowable size of sent messages in MB
	 *
	 * canBeNull && readOnly
	 */
	public Long maxSendSize;

	/**
	 * Exchange service URL
	 *
	 * canBeNull && readOnly
	 */
	public String hostname;

	/**
	 * Maximum allowable size for received messages in MB
	 *
	 * canBeNull && readOnly
	 */
	public Long maxReceiveSize;

	/**
	 * Service family name displayed
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * Expiration date of SSL certificate
	 *
	 * canBeNull && readOnly
	 */
	public Date sslExpirationDate;

	/**
	 * Exchange service name
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * Exchange service state
	 *
	 * canBeNull && readOnly
	 */
	public OvhServiceStateEnum state;

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
}
