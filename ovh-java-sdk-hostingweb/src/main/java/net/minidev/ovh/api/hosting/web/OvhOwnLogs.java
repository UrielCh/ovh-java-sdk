package net.minidev.ovh.api.hosting.web;

import net.minidev.ovh.api.hosting.web.ownlogs.OvhStatusEnum;

/**
 * Hosting own logs
 */
public class OvhOwnLogs {
	/**
	 * The ownlogs fqdn available on logs.clusterXX.hosting.ovh.net
	 *
	 * canBeNull && readOnly
	 */
	public String fqdn;

	/**
	 * Identifier of this ownLogs
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Status of this ownLogs
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
