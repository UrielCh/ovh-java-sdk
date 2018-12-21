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
	 * Application access type
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Login
	 *
	 * canBeNull && readOnly
	 */
	public String login;

	/**
	 * Url
	 *
	 * canBeNull && readOnly
	 */
	public String url;
}
