package net.minidev.ovh.api.monitoring;

import java.util.Date;

/**
 * Shinken resource (e.g. Host, Service, Contact, etc)
 */
public class OvhResource {
	/**
	 * Date of the resource creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * Unique UUID of the resource
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Configuration
	 *
	 * canBeNull && readOnly
	 */
	public OvhConfigPair[] config;

	/**
	 * Date of the resource last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
