package net.minidev.ovh.api.auth;

/**
 * Access rule required for the application
 */
public class OvhAccessRule {
	public OvhAccessRule() {
	}
	public OvhAccessRule(OvhMethodEnum method, String path) {
		this.method = method;
		this.path = path;
	}
	/**
	 * canBeNull
	 */
	public String path;

	/**
	 * canBeNull
	 */
	public OvhMethodEnum method;
}
