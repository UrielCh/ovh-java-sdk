package net.minidev.ovh.api.sslgateway;

/**
 * Server attached to an SSL Gateway
 */
public class OvhServer {
	/**
	 * IP address of the server attached to your SSL Gateway
	 *
	 * canBeNull && readOnly
	 */
	public String address;

	/**
	 * Port of your server attached to your SSL Gateway
	 *
	 * canBeNull && readOnly
	 */
	public Long port;

	/**
	 * Id of your server
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Server state
	 *
	 * canBeNull && readOnly
	 */
	public OvhServerStateEnum state;
}
