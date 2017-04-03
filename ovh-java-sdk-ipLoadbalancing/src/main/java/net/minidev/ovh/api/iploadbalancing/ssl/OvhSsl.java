package net.minidev.ovh.api.iploadbalancing.ssl;

import net.minidev.ovh.api.iploadbalancing.OvhSslTypeEnum;

/**
 * Ssl
 */
public class OvhSsl {
	/**
	 * Serial of your ssl certificate (Deprecated, use fingerprint instead !)
	 *
	 * canBeNull && readOnly
	 */
	public String serial;

	/**
	 * Subject of your ssl certificate
	 *
	 * canBeNull && readOnly
	 */
	public String subject;

	/**
	 * Fingerprint of your ssl certificate
	 *
	 * canBeNull && readOnly
	 */
	public String fingerprint;

	/**
	 * Id of your ssl certificate
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Type of your ssl certificate
	 *
	 * canBeNull && readOnly
	 */
	public OvhSslTypeEnum type;
}
