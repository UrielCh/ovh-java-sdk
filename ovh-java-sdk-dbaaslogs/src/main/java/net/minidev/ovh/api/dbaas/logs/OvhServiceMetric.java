package net.minidev.ovh.api.dbaas.logs;

/**
 * Metrics access
 */
public class OvhServiceMetric {
	/**
	 * Metrics server url
	 *
	 * canBeNull && readOnly
	 */
	public String host;

	/**
	 * Metrics credentials
	 *
	 * canBeNull && readOnly
	 */
	public String token;
}
