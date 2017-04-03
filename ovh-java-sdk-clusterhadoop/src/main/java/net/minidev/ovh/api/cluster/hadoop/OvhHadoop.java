package net.minidev.ovh.api.cluster.hadoop;

/**
 * Managed Hadoop Cluster
 */
public class OvhHadoop {
	/**
	 * Maximum quantity of nodes allowed to be ordered in the cluster
	 *
	 * canBeNull && readOnly
	 */
	public Long maxOrderableNodes;

	/**
	 * Service name of your Cluster
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * State of the Hadoop Cluster
	 *
	 * canBeNull && readOnly
	 */
	public OvhClusterStateEnum state;

	/**
	 * CDH and Cloudera Manager version
	 *
	 * canBeNull && readOnly
	 */
	public String clouderaVersion;
}
