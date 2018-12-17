package net.minidev.ovh.api.cdnanycast;

import java.util.Date;

/**
 * CDN Ssl
 */
public class OvhSsl {
	/**
	 * Provider of the certificate installed on CDN
	 *
	 * canBeNull && readOnly
	 */
	public String certificateProvider;

	/**
	 * canBeNull && readOnly
	 */
	public Date certificateValidFrom;

	/**
	 * canBeNull && readOnly
	 */
	public Date certificateValidTo;

	/**
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * canBeNull && readOnly
	 */
	public String cn;

	/**
	 * canBeNull && readOnly
	 */
	public OvhSslStateEnum status;
}
