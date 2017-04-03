package net.minidev.ovh.api.ip.loadbalancingip;

import net.minidev.ovh.api.ip.OvhLoadBalancingAdditionalPortEnum;

/**
 * LoadBalancingPort mapping
 */
public class OvhLoadBalancingPort {
	/**
	 * canBeNull
	 */
	public Long dstPort;

	/**
	 * canBeNull
	 */
	public OvhLoadBalancingAdditionalPortEnum srcPort;
}
