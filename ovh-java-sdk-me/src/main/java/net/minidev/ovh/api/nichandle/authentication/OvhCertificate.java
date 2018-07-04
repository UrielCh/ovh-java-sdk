package net.minidev.ovh.api.nichandle.authentication;

import java.util.Date;

/**
 * X509 Certificate
 */
public class OvhCertificate {
	/**
	 * Certificate's subject
	 *
	 * canBeNull && readOnly
	 */
	public String subject;

	/**
	 * Certificate's expiration
	 *
	 * canBeNull && readOnly
	 */
	public Date expiration;
}
