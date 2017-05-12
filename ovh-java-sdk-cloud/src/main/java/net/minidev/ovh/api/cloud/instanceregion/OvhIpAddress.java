package net.minidev.ovh.api.cloud.instanceregion;

/**
 * IpAddress
 */
public class OvhIpAddress {
	/**
	 * Instance IP address
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Instance IP address type
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * IP version
	 *
	 * canBeNull && readOnly
	 */
	public Long version;
}
