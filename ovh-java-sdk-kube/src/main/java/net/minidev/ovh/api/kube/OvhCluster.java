package net.minidev.ovh.api.kube;

import java.util.Date;

/**
 * Managed Kubernetes cluster description
 */
public class OvhCluster {
	/**
	 * Cluster nodes URL
	 *
	 * canBeNull && readOnly
	 */
	public String nodesUrl;

	/**
	 * Cluster creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * Cluster name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Cluster ID
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Kubernetes version of your cluster
	 *
	 * canBeNull && readOnly
	 */
	public String version;

	/**
	 * Management URL of your cluster
	 *
	 * canBeNull && readOnly
	 */
	public String url;

	/**
	 * Cluster status
	 *
	 * canBeNull && readOnly
	 */
	public OvhClusterStatus status;

	/**
	 * Cluster last update date
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
