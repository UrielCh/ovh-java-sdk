package net.minidev.ovh.api.hosting.web;

/**
 * State of available php versions for this account
 */
public class OvhPhpVersion {
	/**
	 * Current support of this php version
	 *
	 * canBeNull
	 */
	public OvhPhpVersionStateEnum support;

	/**
	 * PHP version
	 *
	 * canBeNull
	 */
	public String version;
}
