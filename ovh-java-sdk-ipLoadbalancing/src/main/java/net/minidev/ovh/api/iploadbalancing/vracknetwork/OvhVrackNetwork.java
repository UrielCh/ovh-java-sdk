package net.minidev.ovh.api.iploadbalancing.vracknetwork;

/**
 * Represents a private network in the vRack
 */
public class OvhVrackNetwork {
	/**
	 * Internal Load Balancer identifier of the vRack private network description
	 *
	 * canBeNull && readOnly
	 */
	public Long vrackNetworkId;

	/**
	 * IP block of the private network in the vRack
	 *
	 * canBeNull && readOnly
	 */
	public String subnet;

	/**
	 * An IP block used as a pool of IPs by this Load Balancer to connect to the servers in this private network. The block must be in the private network and reserved for the Load Balancer
	 *
	 * canBeNull && readOnly
	 */
	public String natIp;

	/**
	 * VLAN of the private network in the vRack. Null if the private network is not in a VLAN
	 *
	 * canBeNull && readOnly
	 */
	public Long vlan;
}
