package net.minidev.ovh.api.registry;

import java.util.Date;
import net.minidev.ovh.api.registry.namespace.OvhStatus;

/**
 * A namespace in which a user can either read, write or delete images
 */
public class OvhNamespace {
	/**
	 * Date of the resource creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * The namespace name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * The namespace id
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

	/**
	 * The status of the namespace
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;
}
