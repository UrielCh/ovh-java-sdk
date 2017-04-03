package net.minidev.ovh.api.docker;

import java.util.Date;
import net.minidev.ovh.api.docker.slave.OvhMetrics;
import net.minidev.ovh.api.docker.slave.OvhStatus;

/**
 * A host on which containers can be deployed
 */
public class OvhSlave {
	/**
	 * Date of the resource creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * The stack to which the slave belongs
	 *
	 * canBeNull && readOnly
	 */
	public String stack;

	/**
	 * The slave hostname
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * The framework UUID
	 *
	 * canBeNull && readOnly
	 */
	public String flavorId;

	/**
	 * The state of the slave
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus state;

	/**
	 * Metrics about slave usage
	 *
	 * canBeNull && readOnly
	 */
	public OvhMetrics metrics;

	/**
	 * The slave UUID
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * The region where the slave is located
	 *
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * Date of the resource last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
