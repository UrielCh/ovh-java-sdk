package net.minidev.ovh.api.auth;

/**
 * Access rule required for the application
 */
public class OvhAccessRule {
	/**
	 * canBeNull
	 */
	public String path;

	/**
	 * canBeNull
	 */
	public OvhMethodEnum method;
}
