package net.minidev.ovh.api.cloud.subnetworkregion;

/**
 * IPPool
 */
public class OvhIPPool {
	/**
	 * First IP for this region (eg: 192.168.1.12)
	 *
	 * canBeNull && readOnly
	 */
	public String start;

	/**
	 * Last IP for this region (eg: 192.168.1.24)
	 *
	 * canBeNull && readOnly
	 */
	public String end;
}
