package net.minidev.ovh.api.docker.slave.framework.app;

/**
 * Application environment variable
 */
public class OvhEnvironment {
	/**
	 * variable value
	 *
	 * canBeNull && readOnly
	 */
	public String value;

	/**
	 * variable key
	 *
	 * canBeNull && readOnly
	 */
	public String key;
}
