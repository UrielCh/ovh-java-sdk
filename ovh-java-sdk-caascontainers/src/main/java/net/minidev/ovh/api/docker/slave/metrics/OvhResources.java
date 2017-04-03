package net.minidev.ovh.api.docker.slave.metrics;

/**
 * Metrics about available slave resources
 */
public class OvhResources {
	/**
	 * Available memory
	 *
	 * canBeNull && readOnly
	 */
	public Long mem;

	/**
	 * Available CPU
	 *
	 * canBeNull && readOnly
	 */
	public Long cpu;
}
