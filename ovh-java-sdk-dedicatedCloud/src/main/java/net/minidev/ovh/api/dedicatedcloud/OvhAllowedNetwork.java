package net.minidev.ovh.api.dedicatedcloud;

/**
 * Network allowed to connect to the Private Cloud management interface
 */
public class OvhAllowedNetwork {
	/**
	 * canBeNull && readOnly
	 */
	public Long networkAccessId;

	/**
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public OvhAllowedNetworkStateEnum state;

	/**
	 * Network name, e.g. 123.100.200.0/32
	 *
	 * canBeNull && readOnly
	 */
	public String network;
}
