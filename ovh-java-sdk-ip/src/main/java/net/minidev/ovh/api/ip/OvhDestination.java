package net.minidev.ovh.api.ip;

/**
 * A structure given service and its nexthops as a destination for failover ips
 */
public class OvhDestination {
	/**
	 * Service destination
	 *
	 * canBeNull
	 */
	public String service;

	/**
	 * Nexthops available on this service
	 *
	 * canBeNull
	 */
	public String[] nexthop;
}
