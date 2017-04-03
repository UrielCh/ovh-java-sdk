package net.minidev.ovh.api.cluster.hadoop;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Detailed information on a node consumption of a Hadoop Cluster
 */
public class OvhNodeConsumption {
	/**
	 * Name of the node profile for the consumptions
	 *
	 * canBeNull
	 */
	public OvhBillingNameEnum nodeProfile;

	/**
	 * Hostname of the consumed resource
	 *
	 * canBeNull
	 */
	public String hostname;

	/**
	 * Number of hours consummed
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> quantity;
}
