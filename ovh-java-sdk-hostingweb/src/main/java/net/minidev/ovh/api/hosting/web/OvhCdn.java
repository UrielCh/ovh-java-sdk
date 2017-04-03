package net.minidev.ovh.api.hosting.web;

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
	 * Option CDN free with the hosting ?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean free;

	/**
	 * Type of the CDN
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Version of the CDN
	 *
	 * canBeNull && readOnly
	 */
	public String version;

	/**
	 * Status of the CDN option
	 *
	 * canBeNull && readOnly
	 */
	public String status;
}
