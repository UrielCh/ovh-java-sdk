package net.minidev.ovh.api.dbaas.queue;

/**
 * MetricsAccount
 */
public class OvhMetricsAccount {
	/**
	 * OpenTSDB host url
	 *
	 * canBeNull && readOnly
	 */
	public String host;

	/**
	 * Token for OpenTSDB metrics access
	 *
	 * canBeNull && readOnly
	 */
	public String token;
}
