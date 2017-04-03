package net.minidev.ovh.api.router;

/**
 * Virtual Private Network
 */
public class OvhVpn {
	/**
	 * IP you will be connecting from / NULL (allow all)
	 *
	 * canBeNull && readOnly
	 */
	public String clientIp;

	/**
	 * Server's private network
	 *
	 * canBeNull && readOnly
	 */
	public String serverPrivNet;

	/**
	 * Your VPN server IP
	 *
	 * canBeNull && readOnly
	 */
	public String serverIp;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Client's private network
	 *
	 * canBeNull && readOnly
	 */
	public String clientPrivNet;
}
