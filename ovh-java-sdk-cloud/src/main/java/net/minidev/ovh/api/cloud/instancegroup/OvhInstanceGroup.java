package net.minidev.ovh.api.cloud.instancegroup;

/**
 * InstanceGroup
 */
public class OvhInstanceGroup {
	/**
	 * Instances ids
	 *
	 * canBeNull && readOnly
	 */
	public String[] instance_ids;

	/**
	 * Instance group name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Instance group id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Instance group type
	 *
	 * canBeNull && readOnly
	 */
	public OvhInstanceGroupTypeEnum type;

	/**
	 * region
	 *
	 * canBeNull && readOnly
	 */
	public String region;
}
