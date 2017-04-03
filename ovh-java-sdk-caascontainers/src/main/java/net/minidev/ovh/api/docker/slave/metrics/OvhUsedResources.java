package net.minidev.ovh.api.docker.slave.metrics;

/**
 * Metrics about used slave resources
 */
public class OvhUsedResources {
	/**
	 * Used memory
	 *
	 * canBeNull && readOnly
	 */
	public Long mem;

	/**
	 * Used CPU
	 *
	 * canBeNull && readOnly
	 */
	public Long cpu;
}
