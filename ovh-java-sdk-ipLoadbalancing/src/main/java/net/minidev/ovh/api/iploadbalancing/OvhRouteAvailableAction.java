package net.minidev.ovh.api.iploadbalancing;

/**
 * Available route actions options
 */
public class OvhRouteAvailableAction {
	/**
	 * Action name
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * Type of the destination for this action
	 *
	 * canBeNull
	 */
	public String destination;

	/**
	 * Protocol supported by this action
	 *
	 * canBeNull
	 */
	public String type;

	/**
	 * List of available HTTP status code if applicable
	 *
	 * canBeNull
	 */
	public Long[] status;
}
