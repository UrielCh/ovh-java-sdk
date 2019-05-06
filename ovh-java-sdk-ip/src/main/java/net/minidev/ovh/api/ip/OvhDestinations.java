package net.minidev.ovh.api.ip;

/**
 * A structure given all services allowed as a destination for this ip
 */
public class OvhDestinations {
	/**
	 * list of dedicated clouds
	 *
	 * canBeNull
	 */
	public OvhDestination[] dedicatedCloud;

	/**
	 * list of dedicated servers
	 *
	 * canBeNull
	 */
	public OvhDestination[] dedicatedServer;

	/**
	 * list of vps
	 *
	 * canBeNull
	 */
	public OvhDestination[] vps;

	/**
	 * list of hosting reseller services
	 *
	 * canBeNull
	 */
	public OvhDestination[] hostingReseller;

	/**
	 * list of public cloud projects
	 *
	 * canBeNull
	 */
	public OvhDestination[] cloudProject;

	/**
	 * list of load balancing services
	 *
	 * canBeNull
	 */
	public OvhDestination[] ipLoadbalancing;
}
