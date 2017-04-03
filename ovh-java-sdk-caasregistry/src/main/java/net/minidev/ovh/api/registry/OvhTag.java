package net.minidev.ovh.api.registry;

import java.util.Date;

/**
 * An image tag
 */
public class OvhTag {
	/**
	 * Date of the resource creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * The tag name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * The tag id
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
