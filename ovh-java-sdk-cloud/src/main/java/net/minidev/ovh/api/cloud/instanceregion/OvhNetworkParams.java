package net.minidev.ovh.api.cloud.instanceregion;

/**
 * NetworkParams
 */
public class OvhNetworkParams {
	/**
	 * Static ip (Can only be defined for private networks)
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Private or public network Id
	 *
	 * canBeNull && readOnly
	 */
	public String networkId;
}
