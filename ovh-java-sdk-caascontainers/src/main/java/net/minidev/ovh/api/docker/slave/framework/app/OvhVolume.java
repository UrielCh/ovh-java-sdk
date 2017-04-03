package net.minidev.ovh.api.docker.slave.framework.app;

/**
 * Application volumes
 */
public class OvhVolume {
	/**
	 * Volume mode
	 *
	 * canBeNull && readOnly
	 */
	public String mode;

	/**
	 * Container path
	 *
	 * canBeNull && readOnly
	 */
	public Long containerPath;

	/**
	 * Host path
	 *
	 * canBeNull && readOnly
	 */
	public Long hostPath;
}
