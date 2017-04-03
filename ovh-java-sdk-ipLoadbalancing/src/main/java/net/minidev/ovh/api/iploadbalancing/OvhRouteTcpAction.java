package net.minidev.ovh.api.iploadbalancing;

/**
 * Action triggered when all rules from route match
 */
public class OvhRouteTcpAction {
	/**
	 * Action to trigger if all the rules of this route matches
	 *
	 * canBeNull
	 */
	public String type;

	/**
	 * Backend ID for "backend" action type
	 *
	 * canBeNull
	 */
	public String target;
}
