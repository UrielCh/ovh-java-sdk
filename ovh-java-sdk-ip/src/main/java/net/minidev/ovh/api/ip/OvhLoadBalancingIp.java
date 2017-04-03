package net.minidev.ovh.api.ip;

/**
 * Your load balancing IP
 */
public class OvhLoadBalancingIp {
	/**
	 * Location where your service is
	 *
	 * canBeNull && readOnly
	 */
	public OvhLoadBalancingZoneEnum[] zone;

	/**
	 * The type of stickiness currently in place on your Ip LoadBalancing
	 *
	 * canBeNull && readOnly
	 */
	public OvhLoadBalancingStickinessEnum stickiness;

	/**
	 * Your IP load balancing
	 *
	 * canBeNull && readOnly
	 */
	public String ipLoadBalancing;

	/**
	 * Current state of your IP
	 *
	 * canBeNull && readOnly
	 */
	public OvhLoadBalancingStateEnum state;

	/**
	 * The internal name of your IP load balancing
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Ssl activation state
	 *
	 * canBeNull && readOnly
	 */
	public OvhLoadBalancingSslEnum ssl;
}
