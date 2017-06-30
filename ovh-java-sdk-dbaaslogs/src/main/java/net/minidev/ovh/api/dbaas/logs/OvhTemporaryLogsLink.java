package net.minidev.ovh.api.dbaas.logs;

import java.util.Date;

/**
 * Temporary url informations
 */
public class OvhTemporaryLogsLink {
	/**
	 * Temporary url
	 *
	 * canBeNull && readOnly
	 */
	public String url;

	/**
	 * Temporary url expiration date
	 *
	 * canBeNull && readOnly
	 */
	public Date expirationDate;
}
