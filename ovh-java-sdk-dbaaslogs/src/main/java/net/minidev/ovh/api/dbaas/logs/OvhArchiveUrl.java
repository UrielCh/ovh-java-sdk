package net.minidev.ovh.api.dbaas.logs;

import java.util.Date;

/**
 * Stream archive url
 */
public class OvhArchiveUrl {
	/**
	 * Temporary URL to get archive
	 *
	 * canBeNull && readOnly
	 */
	public String url;

	/**
	 * Temporary URL expiration date
	 *
	 * canBeNull && readOnly
	 */
	public Date expirationDate;
}
