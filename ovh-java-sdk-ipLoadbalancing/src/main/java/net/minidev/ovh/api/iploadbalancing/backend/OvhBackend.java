package net.minidev.ovh.api.iploadbalancing.backend;

import net.minidev.ovh.api.iploadbalancing.OvhBalanceEnum;
import net.minidev.ovh.api.iploadbalancing.OvhProbeTypeEnum;
import net.minidev.ovh.api.iploadbalancing.OvhProxyTypeEnum;
import net.minidev.ovh.api.iploadbalancing.OvhStickinessEnum;

/**
 * Backend
 */
public class OvhBackend {
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
	public OvhBalanceEnum balance;

	/**
	 * Zone of you backend.
	 *
	 * canBeNull && readOnly
	 */
	public String zone;

	/**
	 * Port attached to your backend. Inherited from frontend if null
	 *
	 * canBeNull && readOnly
	 */
	public Long port;

	/**
	 * Stickiness type. No stickiness if null
	 *
	 * canBeNull && readOnly
	 */
	public OvhStickinessEnum stickiness;

	/**
	 * Id of your backend
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Type of your backend
	 *
	 * canBeNull && readOnly
	 */
	public OvhProxyTypeEnum type;

	/**
	 * Probe type. 'tcp' if null
	 *
	 * canBeNull && readOnly
	 */
	public OvhProbeTypeEnum probe;
}
