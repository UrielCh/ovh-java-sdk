package net.minidev.ovh.api.iploadbalancing.backendtcp;

import net.minidev.ovh.api.iploadbalancing.OvhBackendProbe;
import net.minidev.ovh.api.iploadbalancing.OvhBalanceTCPEnum;
import net.minidev.ovh.api.iploadbalancing.OvhStickinessTCPEnum;

/**
 * TCP Farm
 */
public class OvhBackendTcp {
	/**
	 * Load balancing algorithm. 'roundrobin' if null
	 *
	 * canBeNull && readOnly
	 */
	public OvhBalanceTCPEnum balance;

	/**
	 * Zone of you farm
	 *
	 * canBeNull && readOnly
	 */
	public String zone;

	/**
	 * Port attached to your farm. Inherited from frontend if null
	 *
	 * canBeNull && readOnly
	 */
	public Long port;

	/**
	 * Stickiness type. No stickiness if null
	 *
	 * canBeNull && readOnly
	 */
	public OvhStickinessTCPEnum stickiness;

	/**
	 * Id of your farm
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Probe used to determine if a backend is alive and can handle requests. Defaults to tcp on the same port as the farm
	 *
	 * canBeNull && readOnly
	 */
	public OvhBackendProbe probe;
}
