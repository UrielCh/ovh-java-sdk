package net.minidev.ovh.api.kube;

import java.util.Date;

/**
 * Node installed on your cluster
 */
public class OvhNode {
	/**
	 * True if the node is up to date
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isUpToDate;

	/**
	 * Flavor name
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
	 * Node name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Node ID
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Node version
	 *
	 * canBeNull && readOnly
	 */
	public String version;

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
