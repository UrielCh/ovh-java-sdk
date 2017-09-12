package net.minidev.ovh.api.hosting.web.user;

/**
 * User, url and port of a service
 */
public class OvhCredentials {
	/**
	 * Port to use to access to the service
	 *
	 * canBeNull
	 */
	public Long port;

	/**
	 * Login to authentificate you on the service
	 *
	 * canBeNull
	 */
	public String user;

	/**
	 * Url to contact the service
	 *
	 * canBeNull
	 */
	public String url;
}
