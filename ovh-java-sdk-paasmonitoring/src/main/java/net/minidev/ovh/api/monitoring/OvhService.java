package net.minidev.ovh.api.monitoring;

import java.util.Date;

/**
 * A Shinken-based monitoring service
 */
public class OvhService {
	/**
	 * failover backend id
	 *
	 * canBeNull && readOnly
	 */
	public String failoverBackendId;

	/**
	 * Date of the resource creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * hostname
	 *
	 * canBeNull && readOnly
	 */
	public String hostname;

	/**
	 * name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * backend id
	 *
	 * canBeNull && readOnly
	 */
	public String backendId;

	/**
	 * Unique UUID of the resource
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
	 * status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;
}
