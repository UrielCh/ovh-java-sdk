package net.minidev.ovh.api.monitoring;

/**
 * Result of a configuration test
 */
public class OvhTestConfigResult {
	/**
	 * valid
	 *
	 * canBeNull && readOnly
	 */
	public Boolean valid;

	/**
	 * errors
	 *
	 * canBeNull && readOnly
	 */
	public String[] errors;
}
