package net.minidev.ovh.api.docker.slave;

import net.minidev.ovh.api.docker.slave.metrics.OvhResources;
import net.minidev.ovh.api.docker.slave.metrics.OvhUsedResources;

/**
 * Metrics about slave usage
 */
public class OvhMetrics {
	/**
	 * Metrics about used slave resources
	 *
	 * canBeNull && readOnly
	 */
	public OvhUsedResources usedResources;

	/**
	 * Metrics about available slave resources
	 *
	 * canBeNull && readOnly
	 */
	public OvhResources resources;
}
