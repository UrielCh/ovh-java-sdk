package net.minidev.ovh.api.hosting.web;

import net.minidev.ovh.api.hosting.web.cdn.OvhStatusEnum;

/**
 * CDN service
 */
public class OvhCdn {
	/**
	 * Domain of this CDN
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * Type of the CDN
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Option CDN free with the hosting ?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean free;

	/**
	 * Version of the CDN
	 *
	 * canBeNull && readOnly
	 */
	public String version;

	/**
	 * The task ID working on this CDN
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * Status of the CDN option
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
