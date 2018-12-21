package net.minidev.ovh.api.iploadbalancing.status;

/**
 * The statuses of a Load Balancer component
 */
public class OvhComponentStatus {
	/**
	 * The number of component with status warn
	 *
	 * canBeNull
	 */
	public Long warn;

	/**
	 * The number of component with status ok
	 *
	 * canBeNull
	 */
	public Long ok;

	/**
	 * The number of component with status error
	 *
	 * canBeNull
	 */
	public Long error;

	/**
	 * The number of component with status unknown
	 *
	 * canBeNull
	 */
	public Long unknown;
}
