package net.minidev.ovh.api.cluster.hadoop;

/**
 * Operation on a Hadoop Cluster component
 */
public class OvhTask {
	/**
	 * Operation name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * Current Task state
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperationStateEnum status;
}
