package net.minidev.ovh.api.hosting.web;

import net.minidev.ovh.api.hosting.web.attacheddomain.OvhCdnEnum;
import net.minidev.ovh.api.hosting.web.attacheddomain.OvhFirewallEnum;

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
	 * IP location of the domain linked
	 *
	 * canBeNull && readOnly
	 */
	public OvhCountryEnum ipLocation;

	/**
	 * Firewall state for this path
	 *
	 * canBeNull && readOnly
	 */
	public OvhFirewallEnum firewall;

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
}
