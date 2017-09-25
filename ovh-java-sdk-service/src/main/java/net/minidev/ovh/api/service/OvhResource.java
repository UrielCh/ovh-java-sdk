package net.minidev.ovh.api.service;

/**
 * Resource service informations
 */
public class OvhResource {
	/**
	 * Custom display name of the service
	 *
	 * canBeNull
	 */
	public String displayName;

	/**
	 * Name of the service
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * Resource state
	 *
	 * canBeNull
	 */
	public OvhResourceStateEnum state;
}
