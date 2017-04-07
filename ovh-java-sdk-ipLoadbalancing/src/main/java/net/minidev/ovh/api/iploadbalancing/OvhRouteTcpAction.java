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
	 * Farm ID for "farm" action type, empty for others
	 *
	 * canBeNull
	 */
	public String target;
}
