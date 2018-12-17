package net.minidev.ovh.api.cloud.instanceinterface;

/**
 * Interface
 */
public class OvhInterface {
	/**
	 * List of ips of the interface
	 *
	 * canBeNull && readOnly
	 */
	public OvhFixedIp[] fixedIps;

	/**
	 * Mac address
	 *
	 * canBeNull && readOnly
	 */
	public String macAddress;

	/**
	 * Network id
	 *
	 * canBeNull && readOnly
	 */
	public String networkId;

	/**
	 * Openstack state
	 *
	 * canBeNull && readOnly
	 */
	public String state;

	/**
	 * Interface unique identifier
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Network type
	 *
	 * canBeNull && readOnly
	 */
	public String type;
}
