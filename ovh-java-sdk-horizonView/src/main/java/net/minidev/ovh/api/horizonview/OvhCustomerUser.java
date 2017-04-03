package net.minidev.ovh.api.horizonview;

/**
 * Horizon As A Service Customer  User
 */
public class OvhCustomerUser {
	/**
	 * Customer id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Email of your HaaS User
	 *
	 * canBeNull && readOnly
	 */
	public String email;

	/**
	 * Customer username of your HaaS User
	 *
	 * canBeNull && readOnly
	 */
	public String username;
}
