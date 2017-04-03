package net.minidev.ovh.api.hosting.web;

import net.minidev.ovh.api.hosting.web.freedom.OvhStatusEnum;

/**
 * Freedoms linked to this hosting account
 */
public class OvhFreedom {
	/**
	 * Freedom domain
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * Freedom type
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Available status for freedom
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
