package net.minidev.ovh.api.cloud.instance;

/**
 * Access
 */
public class OvhAccess {
	/**
	 * Password
	 *
	 * canBeNull && readOnly
	 */
	public String password;

	/**
	 * Login
	 *
	 * canBeNull && readOnly
	 */
	public String login;

	/**
	 * Application access type
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Url
	 *
	 * canBeNull && readOnly
	 */
	public String url;
}
