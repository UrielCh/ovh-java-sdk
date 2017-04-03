package net.minidev.ovh.api.cloud.network;

/**
 * Network
 */
public class OvhNetwork {
	/**
	 * Details about private network in region
	 *
	 * canBeNull && readOnly
	 */
	public OvhNetworkRegion[] regions;

	/**
	 * Network VLAN id
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
	 * Network id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Network type
	 *
	 * canBeNull && readOnly
	 */
	public OvhNetworkTypeEnum type;

	/**
	 * Network status
	 *
	 * canBeNull && readOnly
	 */
	public OvhNetworkStatusEnum status;
}
