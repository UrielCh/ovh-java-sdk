package net.minidev.ovh.api.cloud.instancegroupregion;

import net.minidev.ovh.api.cloud.api.OvhResource;

/**
 * InstanceGroup
 */
public class OvhInstanceGroup {
	/**
	 * Instance ids
	 *
	 * canBeNull && readOnly
	 */
	public OvhResource[] instanceIds;

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
	 * Instance group region
	 *
	 * canBeNull && readOnly
	 */
	public String region;
}
