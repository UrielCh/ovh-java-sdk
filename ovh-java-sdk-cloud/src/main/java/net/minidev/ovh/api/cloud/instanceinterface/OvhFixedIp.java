package net.minidev.ovh.api.cloud.instanceinterface;

/**
 * FixedIp
 */
public class OvhFixedIp {
	/**
	 * Subnetwork Id
	 *
	 * canBeNull && readOnly
	 */
	public String subnetId;

	/**
	 * Ip
	 *
	 * canBeNull && readOnly
	 */
	public String ip;
}
