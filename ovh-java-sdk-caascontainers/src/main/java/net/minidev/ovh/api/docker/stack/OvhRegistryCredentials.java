package net.minidev.ovh.api.docker.stack;

import java.util.Date;

/**
 * Credentials providing authentication to an external registry
 */
public class OvhRegistryCredentials {
	/**
	 * The URL of the registry
	 *
	 * canBeNull && readOnly
	 */
	public String registryUrl;

	/**
	 * Date of the resource creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * The registry account username
	 *
	 * canBeNull && readOnly
	 */
	public String username;

	/**
	 * Date of the resource last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
