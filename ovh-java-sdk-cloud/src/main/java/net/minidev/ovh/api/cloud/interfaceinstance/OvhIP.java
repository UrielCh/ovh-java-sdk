package net.minidev.ovh.api.cloud.interfaceinstance;

import net.minidev.ovh.api.cloud.api.OvhResource;

/**
 * IP
 */
public class OvhIP {
	/**
	 * IP subnetwork
	 *
	 * canBeNull && readOnly
	 */
	public OvhResource subnetwork;

	/**
	 * IP address
	 *
	 * canBeNull && readOnly
	 */
	public String ipAddress;
}
