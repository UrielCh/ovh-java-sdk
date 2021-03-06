package net.minidev.ovh.api.cloud.instance;

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
	 * Network ID
	 *
	 * canBeNull && readOnly
	 */
	public String networkId;

	/**
	 * Gateway IP
	 *
	 * canBeNull && readOnly
	 */
	public String gatewayIp;

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
