package net.minidev.ovh.api.cloud.storage;

/**
 * ContainerAccess
 */
public class OvhContainerAccess {
	/**
	 * Storage access endpoints
	 *
	 * canBeNull && readOnly
	 */
	public OvhEndpoint[] endpoints;

	/**
	 * Storage access token
	 *
	 * canBeNull && readOnly
	 */
	public String token;
}
