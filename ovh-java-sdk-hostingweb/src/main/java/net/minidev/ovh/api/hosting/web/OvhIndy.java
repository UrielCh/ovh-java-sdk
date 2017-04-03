package net.minidev.ovh.api.hosting.web;

import net.minidev.ovh.api.hosting.web.user.OvhStateEnum;

/**
 * Hosting indys
 */
public class OvhIndy {
	/**
	 * AttachedDomain IDs linked to this multidomain
	 *
	 * canBeNull && readOnly
	 */
	public String[] attachedDomains;

	/**
	 * User status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * Login of the multidomain independent user
	 *
	 * canBeNull && readOnly
	 */
	public String login;

	/**
	 * Home directory
	 *
	 * canBeNull && readOnly
	 */
	public String home;
}
