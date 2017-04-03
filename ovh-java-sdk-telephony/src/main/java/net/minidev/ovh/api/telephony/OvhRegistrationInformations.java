package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Informations about a SIP registration (i.e. IP, port, User-Agent...)
 */
public class OvhRegistrationInformations {
	/**
	 * SIP registration's date
	 *
	 * canBeNull
	 */
	public Date datetime;

	/**
	 * SIP registration's port
	 *
	 * canBeNull
	 */
	public Long port;

	/**
	 * SIP registration's domain
	 *
	 * canBeNull
	 */
	public String domain;

	/**
	 * SIP registration's IP
	 *
	 * canBeNull
	 */
	public String ip;

	/**
	 * SIP registration's User-Agent
	 *
	 * canBeNull
	 */
	public String userAgent;
}
