package net.minidev.ovh.api.cloud.networkregion;

/**
 * Network
 */
public class OvhNetwork {
	/**
	 * Network vlan id. Create multiple networks with the same vlan ID to allow private network communication between your regions
	 *
	 * canBeNull && readOnly
	 */
	public Long vlanId;

	/**
	 * Network name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Network ID
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Network region
	 *
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * Network type
	 *
	 * canBeNull && readOnly
	 */
	public OvhNetworkType type;

	/**
	 * Network status
	 *
	 * canBeNull && readOnly
	 */
	public String status;
}
