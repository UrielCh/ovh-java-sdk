package net.minidev.ovh.api.msservices;

import java.util.Date;

/**
 * Temporary link to ADSync software executable
 */
public class OvhActiveDirectorySyncClientUrl {
	/**
	 * Link expiration date
	 *
	 * canBeNull && readOnly
	 */
	public Date expiration;

	/**
	 * ADSync software executable link
	 *
	 * canBeNull && readOnly
	 */
	public String url;
}
