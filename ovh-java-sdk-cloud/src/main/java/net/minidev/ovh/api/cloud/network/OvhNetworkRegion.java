package net.minidev.ovh.api.cloud.network;

/**
 * NetworkRegion
 */
public class OvhNetworkRegion {
	/**
	 * Network region
	 *
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * Network region status
	 *
	 * canBeNull && readOnly
	 */
	public OvhNetworkRegionStatusEnum status;
}
