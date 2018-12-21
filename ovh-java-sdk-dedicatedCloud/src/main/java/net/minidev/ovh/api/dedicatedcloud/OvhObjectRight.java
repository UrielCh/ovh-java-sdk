package net.minidev.ovh.api.dedicatedcloud;

import net.minidev.ovh.api.dedicatedcloud.right.OvhRightEnum;
import net.minidev.ovh.api.dedicatedcloud.right.OvhUserObjectRightTypeEnum;

/**
 * Private Cloud User object right
 */
public class OvhObjectRight {
	/**
	 * Name of the object
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Right propagation on children objects
	 *
	 * canBeNull && readOnly
	 */
	public Boolean propagate;

	/**
	 * User access on the VMware object
	 *
	 * canBeNull && readOnly
	 */
	public OvhRightEnum right;

	/**
	 * canBeNull && readOnly
	 */
	public Long objectRightId;

	/**
	 * Type of the object
	 *
	 * canBeNull && readOnly
	 */
	public OvhUserObjectRightTypeEnum type;

	/**
	 * The VMware MoRef of the object
	 *
	 * canBeNull && readOnly
	 */
	public String vmwareObjectId;
}
