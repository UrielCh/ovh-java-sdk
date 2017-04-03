package net.minidev.ovh.api.registry;

import java.util.Date;

/**
 * The client subscription to the registry service
 */
public class OvhService {
	/**
	 * Date of the resource creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * Maximal number of registered users in the service
	 *
	 * canBeNull && readOnly
	 */
	public Long maxUsers;

	/**
	 * The endpoint used for docker login
	 *
	 * canBeNull && readOnly
	 */
	public String endpoint;

	/**
	 * The name of the geographical zone the service is located in
	 *
	 * canBeNull && readOnly
	 */
	public String zone;

	/**
	 * Maximal number of registered namespaces in the service
	 *
	 * canBeNull && readOnly
	 */
	public Long maxNamespaces;

	/**
	 * The service id
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
