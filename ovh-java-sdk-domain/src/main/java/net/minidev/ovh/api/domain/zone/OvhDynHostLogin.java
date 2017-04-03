package net.minidev.ovh.api.domain.zone;

/**
 * Manage DynHost login
 */
public class OvhDynHostLogin {
	/**
	 * Zone
	 *
	 * canBeNull && readOnly
	 */
	public String zone;

	/**
	 * Subdomain that the login will be allowed to update (* to allow all)
	 *
	 * canBeNull && readOnly
	 */
	public String subDomain;

	/**
	 * Login
	 *
	 * canBeNull && readOnly
	 */
	public String login;
}
