package net.minidev.ovh.api.email.domain;

/**
 * Aliases
 */
public class OvhAlias {
	/**
	 * Name of alias
	 *
	 * canBeNull && readOnly
	 */
	public String from;

	/**
	 * Target account of alias
	 *
	 * canBeNull && readOnly
	 */
	public String to;

	/**
	 * Id of alias
	 *
	 * canBeNull && readOnly
	 */
	public String id;
}
