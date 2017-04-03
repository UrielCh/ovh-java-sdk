package net.minidev.ovh.api.cluster.hadoop;

/**
 * Role (ie set of Hadoop services) of the Node
 */
public class OvhRole {
	/**
	 * ID of the Role
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Role name
	 *
	 * canBeNull && readOnly
	 */
	public OvhRoleTypeEnum type;
}
