package net.minidev.ovh.api.docker;

import java.util.Date;
import net.minidev.ovh.api.docker.slave.OvhMetrics;

/**
 * An isolated client Docker PaaS environment
 */
public class OvhStack {
	/**
	 * The cluster on which the stack is deployed
	 *
	 * canBeNull && readOnly
	 */
	public String cluster;

	/**
	 * Date of the resource creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * A list of slave UUIDs
	 *
	 * canBeNull && readOnly
	 */
	public String[] slaves;

	/**
	 * The DNS address of the stack load balancer
	 *
	 * canBeNull && readOnly
	 */
	public String loadBalancer;

	/**
	 * The stack name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Metrics about slave usage
	 *
	 * canBeNull && readOnly
	 */
	public OvhMetrics metrics;

	/**
	 * Date of the resource last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
