package net.minidev.ovh.api.cloud.operation;

/**
 * Resource
 */
public class OvhResource {
	/**
	 * ID of the resource associated with the operation
	 *
	 * canBeNull && readOnly
	 */
	public String resourceId;

	/**
	 * Link of the resource associated with the operation
	 *
	 * canBeNull && readOnly
	 */
	public net.minidev.ovh.api.cloud.api.OvhResource resourceLink;

	/**
	 * Type of the resource associated with the operation
	 *
	 * canBeNull && readOnly
	 */
	public String resourceType;
}
