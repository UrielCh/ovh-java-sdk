package net.minidev.ovh.api.cloud.instance;

/**
 * ApplicationAccess
 */
public class OvhApplicationAccess {
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
