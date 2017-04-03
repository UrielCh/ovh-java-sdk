package net.minidev.ovh.api.dbaaslogs;

import java.util.Date;

/**
 * Service
 */
public class OvhService {
	/**
	 * Service creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * Contact ID to use
	 *
	 * canBeNull && readOnly
	 */
	public Long contactId;

	/**
	 * Service state
	 *
	 * canBeNull && readOnly
	 */
	public OvhServiceState state;

	/**
	 * Service name
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Service last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;

	/**
	 * Username on DBaaS Logs
	 *
	 * canBeNull && readOnly
	 */
	public String username;
}
