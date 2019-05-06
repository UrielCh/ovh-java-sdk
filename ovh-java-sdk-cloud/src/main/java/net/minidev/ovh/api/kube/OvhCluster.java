package net.minidev.ovh.api.kube;

import java.util.Date;

/**
 * Managed Kubernetes cluster description
 */
public class OvhCluster {
	/**
	 * True if all nodes and control-plane are up to date
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isUpToDate;

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
	 * Cluster last update date
	 *
	 * canBeNull && readOnly
	 */
	public String updatePolicy;

	/**
	 * Cluster name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * True if control-plane is up to date
	 *
	 * canBeNull && readOnly
	 */
	public Boolean controlPlaneIsUpToDate;

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
	 * Cluster last update date
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;

	/**
	 * Cluster status
	 *
	 * canBeNull && readOnly
	 */
	public OvhClusterStatus status;
}
