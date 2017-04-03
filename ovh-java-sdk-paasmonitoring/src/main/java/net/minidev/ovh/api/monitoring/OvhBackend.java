package net.minidev.ovh.api.monitoring;

import java.util.Date;

/**
 * Shinken infrastructure hosting backend
 */
public class OvhBackend {
	/**
	 * Date of the backend creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * The name of the backend
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Unique UUID of the backend
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Date of the backend last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
