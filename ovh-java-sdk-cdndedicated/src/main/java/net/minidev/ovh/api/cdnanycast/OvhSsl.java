package net.minidev.ovh.api.cdnanycast;

import java.util.Date;

/**
 * CDN Ssl
 */
public class OvhSsl {
	/**
	 * canBeNull && readOnly
	 */
	public Date certificateValidFrom;

	/**
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * canBeNull && readOnly
	 */
	public Date certificateValidTo;

	/**
	 * canBeNull && readOnly
	 */
	public String cn;

	/**
	 * canBeNull && readOnly
	 */
	public OvhSslStateEnum status;
}
