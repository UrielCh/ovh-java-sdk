package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing the server's access
 */
public class OvhAccess {
	/**
	 * Password
	 *
	 * canBeNull
	 */
	public String password;

	/**
	 * Application access type
	 *
	 * canBeNull
	 */
	public OvhAccessTypeEnum type;

	/**
	 * Login
	 *
	 * canBeNull
	 */
	public String user;

	/**
	 * Url
	 *
	 * canBeNull
	 */
	public String url;
}
