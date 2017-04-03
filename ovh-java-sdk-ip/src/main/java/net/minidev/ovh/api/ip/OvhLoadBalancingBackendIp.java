package net.minidev.ovh.api.ip;

/**
 * Backends attached to your IP load balancing
 */
public class OvhLoadBalancingBackendIp {
	/**
	 * Location where your service is
	 *
	 * canBeNull && readOnly
	 */
	public OvhLoadBalancingZoneEnum zone;

	/**
	 * Weight of the backend on its zone, must be between 1 and 100, default is 8
	 *
	 * canBeNull && readOnly
	 */
	public Long weight;

	/**
	 * IP of your backend
	 *
	 * canBeNull && readOnly
	 */
	public String backend;

	/**
	 * If the backend has been configured as backup, this field contains the ip of the main backend
	 *
	 * canBeNull && readOnly
	 */
	public String mainBackendIp;

	/**
	 * Probe used for your backend
	 *
	 * canBeNull && readOnly
	 */
	public OvhLoadBalancingBackendProbeEnum probe;
}
