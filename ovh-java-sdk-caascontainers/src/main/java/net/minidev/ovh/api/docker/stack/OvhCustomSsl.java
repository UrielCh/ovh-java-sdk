package net.minidev.ovh.api.docker.stack;

import java.util.Date;

/**
 * A custom SSL certificate associated to a Docker PaaS environment
 */
public class OvhCustomSsl {
	/**
	 * Date of the resource creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * The custom SSL public certificate
	 *
	 * canBeNull && readOnly
	 */
	public String certificate;

	/**
	 * Date of the resource last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
