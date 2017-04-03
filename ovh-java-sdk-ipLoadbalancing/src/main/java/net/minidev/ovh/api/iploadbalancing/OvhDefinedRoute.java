package net.minidev.ovh.api.iploadbalancing;

/**
 * Defined routes name, type and id. Typically used to generate autocomplete lists.
 */
public class OvhDefinedRoute {
	/**
	 * Id of your route
	 *
	 * canBeNull
	 */
	public Long routeId;

	/**
	 * Human readable name for your route
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * Protocol supported by this route
	 *
	 * canBeNull
	 */
	public String type;
}
