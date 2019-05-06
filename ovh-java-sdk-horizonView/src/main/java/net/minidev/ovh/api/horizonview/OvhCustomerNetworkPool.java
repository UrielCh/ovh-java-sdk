package net.minidev.ovh.api.horizonview;

/**
 * You can reach from your virtual desktops, your customer network 
 */
public class OvhCustomerNetworkPool {
	/**
	 * Customer Network id
	 *
	 * canBeNull && readOnly
	 */
	public Long customerNetworkId;

	/**
	 * Name of your network
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Customer network
	 *
	 * canBeNull && readOnly
	 */
	public String network;
}
