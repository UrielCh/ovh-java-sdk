package net.minidev.ovh.api.dbaas.queue;

/**
 * App
 */
public class OvhApp {
	/**
	 * Human ID of the application
	 *
	 * canBeNull && readOnly
	 */
	public String humanId;

	/**
	 * Region ID of the application
	 *
	 * canBeNull && readOnly
	 */
	public String regionId;

	/**
	 * Application name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Application ID
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Application status
	 *
	 * canBeNull && readOnly
	 */
	public OvhAppStatus status;
}
