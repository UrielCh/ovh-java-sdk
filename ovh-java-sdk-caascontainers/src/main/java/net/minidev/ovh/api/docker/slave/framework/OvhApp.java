package net.minidev.ovh.api.docker.slave.framework;

import net.minidev.ovh.api.docker.slave.framework.app.OvhEnvironment;
import net.minidev.ovh.api.docker.slave.framework.app.OvhPort;
import net.minidev.ovh.api.docker.slave.framework.app.OvhVolume;

/**
 * Application data
 */
public class OvhApp {
	/**
	 * Application image
	 *
	 * canBeNull && readOnly
	 */
	public String image;

	/**
	 * Application memory
	 *
	 * canBeNull && readOnly
	 */
	public Long mem;

	/**
	 * Number of running containers instances
	 *
	 * canBeNull && readOnly
	 */
	public Long instances;

	/**
	 * Application volumes
	 *
	 * canBeNull && readOnly
	 */
	public OvhVolume[] volumes;

	/**
	 * Application CPU
	 *
	 * canBeNull && readOnly
	 */
	public Long cpu;

	/**
	 * Application id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Application ports
	 *
	 * canBeNull && readOnly
	 */
	public OvhPort[] ports;

	/**
	 * Application environment
	 *
	 * canBeNull && readOnly
	 */
	public OvhEnvironment[] env;

	/**
	 * Application status
	 *
	 * canBeNull && readOnly
	 */
	public String status;
}
