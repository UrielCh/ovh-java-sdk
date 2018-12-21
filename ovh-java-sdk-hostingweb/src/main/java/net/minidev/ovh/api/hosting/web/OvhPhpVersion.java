package net.minidev.ovh.api.hosting.web;

/**
 * State of available php versions for this account
 */
public class OvhPhpVersion {
	/**
	 * PHP version
	 *
	 * canBeNull
	 */
	public String version;

	/**
	 * Current support of this php version
	 *
	 * canBeNull
	 */
	public OvhPhpVersionStateEnum support;
}
