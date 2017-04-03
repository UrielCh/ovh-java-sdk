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
	 * Internal ID of the phishing entry
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Current state of the phishing
	 *
	 * canBeNull && readOnly
	 */
	public OvhAntiphishingStateEnum state;

	/**
	 * Date of the event
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;
}
