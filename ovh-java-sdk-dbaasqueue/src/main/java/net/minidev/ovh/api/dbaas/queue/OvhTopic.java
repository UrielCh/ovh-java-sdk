package net.minidev.ovh.api.dbaas.queue;

/**
 * Topic
 */
public class OvhTopic {
	/**
	 * Number of partitions
	 *
	 * canBeNull && readOnly
	 */
	public Long partitions;

	/**
	 * Replication factor
	 *
	 * canBeNull && readOnly
	 */
	public Long replicationFactor;

	/**
	 * Topic ID
	 *
	 * canBeNull && readOnly
	 */
	public String id;
}
