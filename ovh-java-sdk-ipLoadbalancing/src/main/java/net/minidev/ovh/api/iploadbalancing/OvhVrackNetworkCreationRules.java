package net.minidev.ovh.api.iploadbalancing;

/**
 * Rules to create a new description of a private network in the vRack
 */
public class OvhVrackNetworkCreationRules {
	/**
	 * Number of remaining private network descriptions available for creation for this Load Balancer
	 *
	 * canBeNull
	 */
	public Long remainingNetworks;

	/**
	 * Name of the vRack on which the current Load Balancer is attached to, as it is named on vRack product
	 *
	 * canBeNull
	 */
	public String vrackName;

	/**
	 * Minimum number of IPs needed to forward requests to your servers using NAT in your private network behind the current Load Balancer. Ip Block given on Load Balancer vRack network must contain at least this number of IP.
	 *
	 * canBeNull
	 */
	public Long minNatIps;
}
