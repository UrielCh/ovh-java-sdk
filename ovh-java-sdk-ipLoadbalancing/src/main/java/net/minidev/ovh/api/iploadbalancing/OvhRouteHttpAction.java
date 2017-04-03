package net.minidev.ovh.api.iploadbalancing;

/**
 * Action triggered when all rules from route match
 */
public class OvhRouteHttpAction {
	/**
	 * Action to trigger if all the rules of this route matches
	 *
	 * canBeNull
	 */
	public String type;

	/**
	 * Backend ID for "backend" action type or URL template for "redirect" action. You may use ${uri}, ${protocol}, ${host}, ${port} and ${path} variables in redirect target
	 *
	 * canBeNull
	 */
	public String target;

	/**
	 * HTTP status code for "redirect" and "reject" actions
	 *
	 * canBeNull
	 */
	public Long status;
}
