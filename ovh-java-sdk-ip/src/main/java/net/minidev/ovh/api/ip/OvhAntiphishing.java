package net.minidev.ovh.api.ip;

import java.util.Date;

/**
 * Phishing URLs hosted on your IP
 */
public class OvhAntiphishing {
	/**
	 * IP address hosting the phishing URL
	 *
	 * canBeNull && readOnly
	 */
	public String ipOnAntiphishing;

	/**
	 * Phishing URL
	 *
	 * canBeNull && readOnly
	 */
	public String urlPhishing;

	/**
	 * Current state of the phishing
	 *
	 * canBeNull && readOnly
	 */
	public OvhAntiphishingStateEnum state;

	/**
	 * Internal ID of the phishing entry
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Date of the event
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;
}
