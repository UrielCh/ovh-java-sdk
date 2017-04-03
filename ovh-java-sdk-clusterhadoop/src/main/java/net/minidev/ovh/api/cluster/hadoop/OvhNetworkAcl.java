package net.minidev.ovh.api.cluster.hadoop;

/**
 * ACL for allowing ip blocks to access to your cluster
 */
public class OvhNetworkAcl {
	/**
	 * description of this ACL
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * IP Block to allow
	 *
	 * canBeNull && readOnly
	 */
	public String block;

	/**
	 * State of the NetworkAcl.
	 *
	 * canBeNull && readOnly
	 */
	public OvhNetworkAclStateEnum state;
}
