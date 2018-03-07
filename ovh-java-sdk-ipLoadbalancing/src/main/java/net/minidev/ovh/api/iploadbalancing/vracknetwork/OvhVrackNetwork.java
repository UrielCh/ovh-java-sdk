package net.minidev.ovh.api.iploadbalancing.vracknetwork;

import net.minidev.ovh.api.iploadbalancing.OvhDefinedFarm;

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
	 * VLAN of the private network in the vRack. 0 if the private network is not in a VLAN
	 *
	 * canBeNull && readOnly
	 */
	public Long vlan;

	/**
	 * Human readable name for your vrack network
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * Farm Id your vrack network is attached to and their type
	 *
	 * canBeNull && readOnly
	 */
	public OvhDefinedFarm[] farmId;
}
