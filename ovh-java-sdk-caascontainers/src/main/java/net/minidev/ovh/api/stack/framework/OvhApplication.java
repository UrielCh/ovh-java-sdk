package net.minidev.ovh.api.stack.framework;

import net.minidev.ovh.api.docker.slave.framework.OvhApp;

/**
 * Application deployed on the framework
 */
public class OvhApplication {
	/**
	 * Application list
	 *
	 * canBeNull && readOnly
	 */
	public OvhApp[] apps;
}
