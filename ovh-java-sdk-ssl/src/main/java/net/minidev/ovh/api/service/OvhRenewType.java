package net.minidev.ovh.api.service;

/**
 * Map a possible renew for a specific service
 */
public class OvhRenewType {
	/**
	 * period of renew in month
	 *
	 * canBeNull
	 */
	public Long period;

	/**
	 * The service will be deleted at expiration
	 *
	 * canBeNull
	 */
	public Boolean deleteAtExpiration;

	/**
	 * The service forced to be renewed
	 *
	 * canBeNull
	 */
	public Boolean forced;

	/**
	 * The service is automatically renewed
	 *
	 * canBeNull
	 */
	public Boolean automatic;
}
