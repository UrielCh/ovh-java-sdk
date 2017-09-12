package net.minidev.ovh.api.hosting.web;

/**
 * Url and port of a service
 */
public class OvhAddress {
	/**
	 * Port to use to access to the service
	 *
	 * canBeNull
	 */
	public Long port;

	/**
	 * Url to contact the service
	 *
	 * canBeNull
	 */
	public String url;
}
