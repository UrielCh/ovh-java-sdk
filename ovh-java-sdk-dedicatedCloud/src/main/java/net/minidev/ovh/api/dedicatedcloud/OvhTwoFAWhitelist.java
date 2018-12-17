package net.minidev.ovh.api.dedicatedcloud;

/**
 * Trust IP which can bypass the two factor authentication
 */
public class OvhTwoFAWhitelist {
	/**
	 * IP address of the remote service
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Description of the trusted IP
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Id of the trusted IP
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * State of the whitelist
	 *
	 * canBeNull && readOnly
	 */
	public OvhTwoFAWhitelistStateEnum state;
}
