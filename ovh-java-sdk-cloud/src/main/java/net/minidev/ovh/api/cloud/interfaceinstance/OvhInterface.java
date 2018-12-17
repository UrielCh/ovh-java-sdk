package net.minidev.ovh.api.cloud.interfaceinstance;

import net.minidev.ovh.api.cloud.api.OvhResource;

/**
 * Interface
 */
public class OvhInterface {
	/**
	 * Interface ID
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Interface IPs
	 *
	 * canBeNull && readOnly
	 */
	public OvhIP[] ips;

	/**
	 * Interface status
	 *
	 * canBeNull && readOnly
	 */
	public String status;

	/**
	 * Interface network
	 *
	 * canBeNull && readOnly
	 */
	public OvhResource network;
}
