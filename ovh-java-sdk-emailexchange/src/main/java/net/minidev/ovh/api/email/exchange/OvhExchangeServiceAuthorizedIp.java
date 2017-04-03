package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Get authorized IPs for POP, IMAP and webmail
 */
public class OvhExchangeServiceAuthorizedIp {
	/**
	 * Authorized IP
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Authorized IP status
	 *
	 * canBeNull && readOnly
	 */
	public OvhAuthorizedIpStatusEnum status;
}
