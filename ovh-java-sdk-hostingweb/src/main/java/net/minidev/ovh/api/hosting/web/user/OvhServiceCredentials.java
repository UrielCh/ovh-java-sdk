package net.minidev.ovh.api.hosting.web.user;

/**
 * Different credentials to manage your service
 */
public class OvhServiceCredentials {
	/**
	 * Credentials to manage files by ftp
	 *
	 * canBeNull
	 */
	public OvhCredentials ftp;

	/**
	 * Credentials to manage webhosting by ssh
	 *
	 * canBeNull
	 */
	public OvhCredentials ssh;
}
