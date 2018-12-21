package net.minidev.ovh.api.iploadbalancing.backendtcp;

import net.minidev.ovh.api.iploadbalancing.OvhBackendProbe;
import net.minidev.ovh.api.iploadbalancing.OvhBalanceTCPEnum;
import net.minidev.ovh.api.iploadbalancing.OvhStickinessTCPEnum;

/**
 * TCP Farm
 */
public class OvhBackendTcp {
	/**
	 * Internal Load Balancer identifier of the vRack private network attached to your farm, mandatory when your Load Balancer is attached to a vRack
	 *
	 * canBeNull && readOnly
	 */
	public Long vrackNetworkId;

	/**
	 * Load balancing algorithm. 'roundrobin' if null
	 *
	 * canBeNull && readOnly
	 */
	public OvhBalanceTCPEnum balance;

	/**
	 * Port attached to your farm. Inherited from frontend if null
	 *
	 * canBeNull && readOnly
	 */
	public Long port;

	/**
	 * Zone of you farm
	 *
	 * canBeNull && readOnly
	 */
	public String zone;

	/**
	 * Human readable name for your backend, this field is for you
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

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
	public Long farmId;

	/**
	 * Probe used to determine if a backend is alive and can handle requests. Defaults to tcp on the same port as the farm
	 *
	 * canBeNull && readOnly
	 */
	public OvhBackendProbe probe;
}
