package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Export PST file url
 */
public class OvhExportUrl {
	/**
	 * Url expiration date
	 *
	 * canBeNull && readOnly
	 */
	public Date expiration;

	/**
	 * Export url
	 *
	 * canBeNull && readOnly
	 */
	public String url;
}
