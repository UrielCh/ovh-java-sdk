package net.minidev.ovh.api.cluster.hadoop;

/**
 * Detailed information on the order of one Hadoop Cluster
 */
public class OvhOrderInformations {
	/**
	 * Maximal number of Node allowed in one order
	 *
	 * canBeNull
	 */
	public Long maximumOrderableNodes;

	/**
	 * Minimum number of Node allowed in one order
	 *
	 * canBeNull
	 */
	public Long minimumOrderableNodes;
}
