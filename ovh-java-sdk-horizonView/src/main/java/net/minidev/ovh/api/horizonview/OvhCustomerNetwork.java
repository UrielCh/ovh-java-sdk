package net.minidev.ovh.api.horizonview;

/**
 * You can reach from your virtual desktops, your customer network 
 */
public class OvhCustomerNetwork {
	/**
	 * Name of your network
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Customer Network id
	 *
	 * canBeNull && readOnly
	 */
	public Long customerNetworkId;

	/**
	 * Customer network
	 *
	 * canBeNull && readOnly
	 */
	public String network;
}
