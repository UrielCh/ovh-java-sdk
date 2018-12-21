package net.minidev.ovh.api.dedicated.ceph;

import net.minidev.ovh.api.dedicated.ceph.poollist.response.OvhPoolTypeEnum;

/**
 * List of cluster pools
 */
public class OvhResponse {
	/**
	 * Number of replica
	 *
	 * canBeNull && readOnly
	 */
	public Long replicaCount;

	/**
	 * Determine if pool should be backuped
	 *
	 * canBeNull && readOnly
	 */
	public Boolean backup;

	/**
	 * Name of ceph user
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Minimum active replicas
	 *
	 * canBeNull && readOnly
	 */
	public Long minActiveReplicas;

	/**
	 * ID of cluster
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Type of pool
	 *
	 * canBeNull && readOnly
	 */
	public OvhPoolTypeEnum poolType;
}
