package net.minidev.ovh.api.hosting.web;

import net.minidev.ovh.api.hosting.web.attacheddomain.OvhCdnEnum;
import net.minidev.ovh.api.hosting.web.attacheddomain.OvhFirewallEnum;
import net.minidev.ovh.api.hosting.web.attacheddomain.OvhStatusEnum;

/**
 * Virtual service
 */
public class OvhAttachedDomain {
	/**
	 * Domain path, relative to your home directory
	 *
	 * canBeNull && readOnly
	 */
	public String path;

	/**
	 * Put domain for separate the logs
	 *
	 * canBeNull && readOnly
	 */
	public String ownLog;

	/**
	 * Firewall state for this path
	 *
	 * canBeNull && readOnly
	 */
	public OvhFirewallEnum firewall;

	/**
	 * IP location of the domain linked
	 *
	 * canBeNull && readOnly
	 */
	public OvhCountryEnum ipLocation;

	/**
	 * Domain linked (fqdn)
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * Is linked to the hosting cdn
	 *
	 * canBeNull && readOnly
	 */
	public OvhCdnEnum cdn;

	/**
	 * Put domain in ssl certificate
	 *
	 * canBeNull && readOnly
	 */
	public Boolean ssl;

	/**
	 * The task ID working on this domain
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * The runtime configuration ID used on this domain
	 *
	 * canBeNull && readOnly
	 */
	public Long runtimeId;

	/**
	 * The domain status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
