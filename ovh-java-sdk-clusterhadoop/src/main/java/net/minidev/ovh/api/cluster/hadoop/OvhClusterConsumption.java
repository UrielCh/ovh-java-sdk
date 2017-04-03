package net.minidev.ovh.api.cluster.hadoop;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Detailed information on a Hadoop Cluster consumption
 */
public class OvhClusterConsumption {
	/**
	 * Number of hours consummed
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> quantity;
}
