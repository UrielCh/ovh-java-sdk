package net.minidev.ovh.api.docker.stack;

/**
 * A custom SSL certificate associated to a Docker PaaS environment
 */
public class OvhInputCustomSsl {
	/**
	 * The custom SSL public certificate
	 *
	 * canBeNull && readOnly
	 */
	public String certificate;

	/**
	 * The custom SSL certificate private key
	 *
	 * canBeNull && readOnly
	 */
	public String key;
}
