package net.minidev.ovh.api.iploadbalancing.ssl;

import java.util.Date;
import net.minidev.ovh.api.iploadbalancing.OvhSslTypeEnum;

/**
 * Ssl
 */
public class OvhSsl {
	/**
	 * Subject Alternative Name of your SSL certificate
	 *
	 * canBeNull && readOnly
	 */
	public String[] san;

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
	 * Human readable name for your ssl certificate, this field is for you
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * Fingerprint of your SSL certificate
	 *
	 * canBeNull && readOnly
	 */
	public String fingerprint;

	/**
	 * Expire date of your SSL certificate
	 *
	 * canBeNull && readOnly
	 */
	public Date expireDate;

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
