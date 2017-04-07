package net.minidev.ovh.api.iploadbalancing.ssl;

import net.minidev.ovh.api.iploadbalancing.OvhSslTypeEnum;

/**
 * Ssl
 */
public class OvhSsl {
	/**
	 * Serial of your SSL certificate (Deprecated, use fingerprint instead !)
	 *
	 * canBeNull && readOnly
	 */
	public String serial;

	/**
	 * Subject of your SSL certificate
	 *
	 * canBeNull && readOnly
	 */
	public String subject;

	/**
	 * Fingerprint of your SSL certificate
	 *
	 * canBeNull && readOnly
	 */
	public String fingerprint;

	/**
	 * Id of your SSL certificate
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Type of your SSL certificate.
'built' for SSL certificates managed by the IP Load Balancing. 'custom' for user manager certificates.
	 *
	 * canBeNull && readOnly
	 */
	public OvhSslTypeEnum type;
}
