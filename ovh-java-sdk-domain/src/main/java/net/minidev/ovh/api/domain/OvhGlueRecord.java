package net.minidev.ovh.api.domain;

/**
 * Glue record
 */
public class OvhGlueRecord {
	/**
	 * Host of the glue record
	 *
	 * canBeNull && readOnly
	 */
	public String host;

	/**
	 * Ips of the glue record
	 *
	 * canBeNull && readOnly
	 */
	public String[] ips;
}
