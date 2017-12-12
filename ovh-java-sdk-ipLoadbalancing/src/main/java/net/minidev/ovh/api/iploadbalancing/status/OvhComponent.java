package net.minidev.ovh.api.iploadbalancing.status;

/**
 * The global status of a Load Balancer component
 */
public class OvhComponent {
	/**
	 * The Load Balancer total component count
	 *
	 * canBeNull
	 */
	public Long total;

	/**
	 * The global status of your Load Balancer component
	 *
	 * canBeNull
	 */
	public OvhComponentStatus status;
}
