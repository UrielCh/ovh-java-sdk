package net.minidev.ovh.api.dbaas.queue;

/**
 * AppConfiguration
 */
public class OvhAppConfiguration {
	/**
	 * Application
	 *
	 * canBeNull && readOnly
	 */
	public OvhApp app;

	/**
	 * List of created roles
	 *
	 * canBeNull && readOnly
	 */
	public OvhRole[] roles;

	/**
	 * Metrics account
	 *
	 * canBeNull && readOnly
	 */
	public OvhMetricsAccount metricsAccount;

	/**
	 * List of created users
	 *
	 * canBeNull && readOnly
	 */
	public OvhUserWithPassword[] users;
}
