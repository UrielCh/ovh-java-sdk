package net.minidev.ovh.api.stack;

import java.util.Date;

/**
 * A framework installed for a docker PaaS stack
 */
public class OvhFramework {
	/**
	 * Date of the resource creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * The framework name
	 *
	 * canBeNull && readOnly
	 */
	public String accessUrl;

	/**
	 * The framework name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * The framework UUID
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Date of the resource last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
