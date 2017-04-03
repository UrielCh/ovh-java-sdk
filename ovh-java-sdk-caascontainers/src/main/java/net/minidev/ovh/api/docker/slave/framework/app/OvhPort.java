package net.minidev.ovh.api.docker.slave.framework.app;

/**
 * Application ports
 */
public class OvhPort {
	/**
	 * Port protocol
	 *
	 * canBeNull && readOnly
	 */
	public String protocol;

	/**
	 * Container port
	 *
	 * canBeNull && readOnly
	 */
	public Long containerPort;

	/**
	 * Host port
	 *
	 * canBeNull && readOnly
	 */
	public Long hostPort;
}
