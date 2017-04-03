package net.minidev.ovh.api.dedicated.server;

/**
 * Available boot options
 */
public class OvhNetbootOption {
	/**
	 * the value of this option
	 *
	 * canBeNull && readOnly
	 */
	public String value;

	/**
	 * The option of this boot
	 *
	 * canBeNull && readOnly
	 */
	public OvhBootOptionEnum option;
}
