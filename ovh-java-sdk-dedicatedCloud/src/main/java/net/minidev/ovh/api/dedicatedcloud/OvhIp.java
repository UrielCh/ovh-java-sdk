package net.minidev.ovh.api.dedicatedcloud;

/**
 * IP Blocks associated with a Private Cloud
 */
public class OvhIp {
	/**
	 * canBeNull && readOnly
	 */
	public String country;

	/**
	 * Network name
	 *
	 * canBeNull && readOnly
	 */
	public String networkName;

	/**
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Vlan where this network is routed
	 *
	 * canBeNull && readOnly
	 */
	public Long vlanNumber;

	/**
	 * IP ex: 213.186.33.34/24
	 *
	 * canBeNull && readOnly
	 */
	public String network;

	/**
	 * The Regional Internet Registry of this Ip Block
	 *
	 * canBeNull && readOnly
	 */
	public OvhBlockRegisterEnum register;
}
