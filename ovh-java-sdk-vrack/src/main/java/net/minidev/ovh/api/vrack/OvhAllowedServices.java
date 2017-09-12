package net.minidev.ovh.api.vrack;

/**
 * A structure given all service allowed for this vrack
 */
public class OvhAllowedServices {
	/**
	 * list of legacy vrack (1.0) allowed to be connected to vrack
	 *
	 * canBeNull
	 */
	public String[] legacyVrack;

	/**
	 * list of dedicated cloud datacenters allowed to be connected to vrack
	 *
	 * canBeNull
	 */
	public String[] dedicatedCloudDatacenter;

	/**
	 * list of dedicated cloud allowed to be connected to vrack
	 *
	 * canBeNull
	 */
	public String[] dedicatedCloud;

	/**
	 * list of blocks allowed to be connected to vrack
	 *
	 * canBeNull
	 */
	public String[] ip;

	/**
	 * list of dedicated servers allowed to be connected to vrack
	 *
	 * canBeNull
	 */
	public String[] dedicatedServer;

	/**
	 * list of dedicated connect links allowed to be connected to vrack
	 *
	 * canBeNull
	 */
	public String[] dedicatedConnect;

	/**
	 * list of dedicated server interfaces allowed to be connected to vrack
	 *
	 * canBeNull
	 */
	public OvhAllowedDedicatedServerInterfaces[] dedicatedServerInterface;

	/**
	 * list of ipLoadbalancing allowed to be connected to vrack
	 *
	 * canBeNull
	 */
	public String[] ipLoadbalancing;

	/**
	 * list of publicCloud projects allowed to be connected to vrack
	 *
	 * canBeNull
	 */
	public String[] cloudProject;
}
