package net.minidev.ovh.api.hosting.web;

/**
 * Different url to manage your service
 */
public class OvhServiceAccess {
	/**
	 * Address with url and port to manage files by ftp
	 *
	 * canBeNull
	 */
	public OvhAddress ftp;

	/**
	 * Address to see your webhosting without domain
	 *
	 * canBeNull
	 */
	public OvhAddress http;

	/**
	 * Address with url and port to manage webhosting by ssh
	 *
	 * canBeNull
	 */
	public OvhAddress ssh;
}
