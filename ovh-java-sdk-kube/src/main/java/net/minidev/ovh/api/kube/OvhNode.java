package net.minidev.ovh.api.kube;

import java.util.Date;

/**
 * Node installed on your cluster
 */
public class OvhNode {
	/**
	 * Public Cloud flavor name
	 *
	 * canBeNull && readOnly
	 */
	public String flavor;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * Public Cloud instance id
	 *
	 * canBeNull && readOnly
	 */
	public String instanceId;

	/**
	 * Node ID
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Public Cloud project ID where the node is started
	 *
	 * canBeNull && readOnly
	 */
	public String projectId;

	/**
	 * Status
	 *
	 * canBeNull && readOnly
	 */
	public OvhNodeStatus status;

	/**
	 * Node last update date
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
